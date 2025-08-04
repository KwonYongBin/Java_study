package chapter21_mini_project.repository;

import java.util.List;
import chapter21_mini_project.model.MarketBookData;

public interface MarketBookRepository {
	int insert(MarketBookData entyti);
	List<MarketBookData> findAll();
	MarketBookData find(String bisbn);
	int update(MarketBookData entity);
	int remove(String bisbn);
	int remove(MarketBookData book);
	int getCount();
}
