package chapter21_mini_project.repository;

import java.util.List;

import chapter21_mini_project.model.MarketMemberData;
import db.DBConn;

public class InMemoryMarketMemberRepository extends DBConn
				implements MarketRepositoryInterface<MarketMemberData>{

	@Override
	public int insert(MarketMemberData member) {
		int rows = 0;
		String sql = """
				insert into book_market_member(name, address, phone, mdate)
						values(?, ?, ?, now())
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getAddress());
			pstmt.setString(3, member.getPhone());
			
			rows = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public String finId() {
		String mid = null;
		String sql = """
				select mid from book_market_member
				order by mdate desc
				limit 1
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				mid = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mid;
	}

	@Override
	public List<MarketMemberData> findAll() {
		List<MarketMemberData> list = null;
		String sql = """
				select mid,
					   name,
					   address,
					   phone,
					   mdate
				from book_market_member
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MarketMemberData member = new MarketMemberData();
				member.setMid(rs.getString(1));
				member.setName(rs.getString(2));
				member.setAddress(rs.getString(3));
				member.setPhone(rs.getString(4));
				member.setMdate(rs.getString(5));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public MarketMemberData find1(String mid) {
		MarketMemberData member = null;
		String sql = """
				select mid,
				       address,
				       phone,
				       left(mdate, 10) as mdate
				from book_market_member
				where mid = ?
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				member = new MarketMemberData();
				member.setMid(rs.getString(1));
				member.setName(rs.getString(2));
				member.setAddress(rs.getString(3));
				member.setPhone(rs.getString(4));
				member.setMdate(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}


	@Override
	public int update(MarketMemberData entity) {
		return 0;
	}

	@Override
	public int remove(String bisbn) {
		return 0;
	}

	@Override
	public int removeAll() {
		return 0;
	}

	@Override
	public int getCount() {
		return 0;
	}
	
	
	@Override
	public MarketMemberData find(String bisbn) {
		return null;
	}
	
}
