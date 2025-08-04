package chapter21_mini_project.service;

import java.util.List;

import chapter21_mini_project.GenericMarketBookRepositoryInterface;
import chapter21_mini_project.application.MarketBookApplication;
import chapter21_mini_project.model.MarketBookData;
import chapter21_mini_project.repository.InMemoryMarketBookRepository;

public class DefaultMarketBookService implements MarketBookService {
	MarketBookApplication mma;
	GenericMarketBookRepositoryInterface<MarketBookData> reposytory;
	
	public DefaultMarketBookService() {}
	public DefaultMarketBookService(MarketBookApplication mma) {
		this.mma = mma;
		this.reposytory = new InMemoryMarketBookRepository();
	}
	

	public MarketBookData crateBook() {
		MarketBookData book = new MarketBookData();
		
		System.out.println("도서명 > ");
		book.setBtitle(mma.scan.next());

		System.out.println("가격 > ");
		book.setBprice(mma.scan.nextInt());
		
		System.out.println("저자 > ");
		book.setBauthor(mma.scan.next());

		System.out.println("부제 > ");
		book.setBsubname(mma.scan.next());
		
		System.out.println("구분 > ");
		book.setBdivision(mma.scan.next());
		
		return book;
	}
	
	@Override
	public void bookRegister() {
		MarketBookData book = crateBook();
		if(reposytory.insert(book) == 1) {
			System.out.println("도서 등록 완료");
		} else {
			System.out.println("도서 등록 실패");
		}
		mma.showBookMenu();
	}
	@Override
	
	public void bookList() {
		if(reposytory.getCount() != 0) {
			List<MarketBookData> library = reposytory.findAll();
			System.out.println("-------------------------------------------------");
			library.forEach(book -> {
				System.out.print(book.getBisbn());
				System.out.print(book.getBtitle());
				System.out.print(book.getBprice());
				System.out.print(book.getBauthor());
				System.out.print(book.getBsubname());
				System.out.print(book.getBdivision());
				System.out.print(book.getBdate());
			});
			System.out.println("-------------------------------------------------");
		} else {
			System.out.println("도서는 존재하지 않습니다.");
		}
		mma.showBookMenu();
	}


	@Override
	public void bookSearch() {
		if(reposytory.getCount() !=0) {
			System.out.println("도서번호 > ");
			String bisbn = mma.scan.next();
			MarketBookData book = reposytory.find(bisbn);
			if(book != null) {
				printBook(book);
			} else {
				System.out.println("검색한 도서는 존재하지 않습니다.");
			}
		} else {
			System.out.println("등록된 도서 중에는 존재하지 않습니다.");
		}
		mma.showBookMenu();
	}
	@Override
	public void bookUpdate() {}
	@Override
	public void bookDeleete() {}
	@Override
	public void crateBookExit() {}

	public void printBook(MarketBookData book) {
		System.out.println("-------------------------------------------------");
		System.out.println(book.getBisbn());
		System.out.println(book.getBtitle());
		System.out.println(book.getBauthor());
		System.out.println(book.getBprice());
		System.out.println("-------------------------------------------------");
	}
}
