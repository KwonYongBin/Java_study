package db;

//import java.awt.print.Book;
import java.util.List;

import com.bookmgm.model.Book;
import com.scoremgm.model.MemberVo;

public interface GenericRepositoryInterface<T> {
	int insert(T entity);
	int getCount();
	List<T> findAll();
	T find(String id);
	int update(T entity);
	int remove(String bid);
	void close();
}