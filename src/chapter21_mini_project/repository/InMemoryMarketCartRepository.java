package chapter21_mini_project.repository;

import java.util.List;

import chapter21_mini_project.model.MarketCartData;
import db.DBConn;

public class InMemoryMarketCartRepository extends DBConn
implements MarketRepositoryInterface<MarketCartData>{

	@Override
	public int insert(MarketCartData entyti) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String finId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarketCartData> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MarketCartData find(String bisbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MarketCartData find1(String mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(MarketCartData entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(String bisbn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
