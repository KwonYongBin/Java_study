package chapter21_mini_project;

import java.util.List;

public interface GenericMarketBookRepositoryInterface<T> {
	int insert(T entyti);
	int getCount();
	List<T> findAll();
	T find(String bisbn);
	int update(T entity);
	int remove(String bisbn);
	void close();
}
