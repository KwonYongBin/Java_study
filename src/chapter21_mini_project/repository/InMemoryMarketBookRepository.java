package chapter21_mini_project.repository;

import java.util.ArrayList;
import java.util.List;

import chapter21_mini_project.GenericMarketBookRepositoryInterface;
import chapter21_mini_project.model.MarketBookData;
import db.DBConn;

public class InMemoryMarketBookRepository extends DBConn 
			implements GenericMarketBookRepositoryInterface<MarketBookData>{
	
	public InMemoryMarketBookRepository () {
		super();
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
					select btitle, bprice, bauthor, bsubname, bdivision, bdate
					from book_market_books
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			if(rs != null) {
				list = new ArrayList<MarketBookData>();
				while(rs.next()) {
					MarketBookData book = new MarketBookData();
					book.setBtitle(rs.getString(1));
					book.setBprice(rs.getInt(2));
					book.setBauthor(rs.getNString(3));
					book.setBsubname(rs.getString(4));
					book.setBdivision(rs.getString(5));
					book.setBdate(rs.getString(6));
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
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int remove(String bisbn) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getCount() {
		return 0;
	}
}
