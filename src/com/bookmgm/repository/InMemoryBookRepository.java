package com.bookmgm.repository;

import java.util.ArrayList;
import java.util.List;
import com.bookmgm.model.Book;

public class InMemoryBookRepository implements BookRepository {
	
	public boolean insert(Book book) {
		return false;
	}
	
	public List<Book> selectAll(){
		return new ArrayList<Book>();
	}
	
	public Book select(String id){
		return new Book();
	}
	
	public void update(Book book){}
	
	public void remove(String id){}
	
	public int getCount(){
		return 0;
	}

}