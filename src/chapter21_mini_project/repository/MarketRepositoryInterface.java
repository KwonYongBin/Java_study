package chapter21_mini_project.repository;

import java.util.List;

public interface MarketRepositoryInterface<T> {
	int insert(T entyti);
	String finId();
	List<T> findAll();
	T find(String bisbn);
	T find1(String mid);
	int update(T entity);
	int remove(String bisbn);
	int removeAll();
	int getCount();
	void close();
}
