package chapter21_mini_project.repository;

import java.util.ArrayList;
import java.util.List;

import chapter21_mini_project.application.MarketBookApplication;
import chapter21_mini_project.model.MarketBookData;
import db.DBConn;

public class InMemoryMarketBookRepository extends DBConn 
			implements MarketRepositoryInterface<MarketBookData>{
	MarketRepositoryInterface<MarketBookData> repository;
	MarketBookApplication mma;
	
	static final String BOOKS = "book_market_books";
	static final String CART = "book_market_cart";
	static final String MEMBER = "book_market_member";
	String tableName = "";
	
	public InMemoryMarketBookRepository () {}
	public InMemoryMarketBookRepository (int rno) {
		super();
		createTitle(rno);
	}
	
	public void createTitle(int rno) {
		String name = null;
		if(rno == 1) {
			name = "도서 등록";
			tableName = BOOKS;
		} else if(rno == 2) {
			name = "장바구니";
			tableName = CART;
		} else if(rno == 3) {
			name = "회원";
			tableName = MEMBER;
		}
		System.out.println(tableName + "목록");
	}
	
	@Override
	public int insert(MarketBookData entyti) {
		int rows = 0;
		String sql = """
					insert into book_market_books(btitle, bprice, bauthor, bsubname, bdivision, bdate)
					values(?, ?, ?, ?, ?, now())
				""";
		
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, entyti.getBtitle());
			pstmt.setInt(2, entyti.getBprice());
			pstmt.setString(3, entyti.getBauthor());
			pstmt.setString(4, entyti.getBsubname());
			pstmt.setString(5, entyti.getBdivision());
			
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
	
	@Override
	public List<MarketBookData> findAll() {
		List<MarketBookData> list = null;
		String sql = """
					select bisbn, btitle, bprice, bauthor, bsubname, bdivision, bdate
					from book_market_books
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			if(rs != null) {
				list = new ArrayList<MarketBookData>();
				while(rs.next()) {
					MarketBookData book = new MarketBookData();
					book.setBisbn(rs.getString(1));
					book.setBtitle(rs.getString(2));
					book.setBprice(rs.getInt(3));
					book.setBauthor(rs.getNString(4));
					book.setBsubname(rs.getString(5));
					book.setBdivision(rs.getString(6));
					book.setBdate(rs.getString(7));
					
					list.add(book);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public MarketBookData find(String bisbn) {
		MarketBookData bs = null;
		String sql = """
					select bisbn, btitle, bprice, bauthor, bsubname, bdivision, bdate
					from book_market_books
					where bisbn = ?
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, bisbn);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bs = new MarketBookData();
				bs.setBisbn(rs.getString(1));
				bs.setBtitle(rs.getString(2));
				bs.setBprice(rs.getInt(3));
				bs.setBauthor(rs.getString(4));
				bs.setBdivision(rs.getString(5));
				bs.setBdate(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bs;
	}
	
	@Override
	public int update(MarketBookData entity) {
		int rows = 0;
		String sql = "update book_market_books set btitle = ?, bprice = ?, bauthor = ?, bsubname = ?, bdivision = ? where bisbn = ?";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, entity.getBtitle());
			pstmt.setInt(2, entity.getBprice());
			pstmt.setString(3, entity.getBauthor());
			pstmt.setString(4, entity.getBsubname());
			pstmt.setString(5, entity.getBdivision());
			pstmt.setString(6, entity.getBisbn());
			
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
	
	@Override
	public int remove(String bisbn) {
		int rows = 0;
		String sql = "delete from book_market_books where bisbn = ?";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, bisbn);
			
			rows = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public int getCount() {
		int rows = 0;
		String sql = "select count(*) as count from book_market_books";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) rows = rs.getInt("count");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
	@Override
	public String finId() {
		return null;
	}
	@Override
	public int removeAll() {
		return 0;
	}
	@Override
	public MarketBookData find1(String mid) {
		return null;
	}
}
