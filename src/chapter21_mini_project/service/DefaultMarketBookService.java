package chapter21_mini_project.service;

import java.util.List;

import chapter21_mini_project.GenericMarketBookRepositoryInterface;
import chapter21_mini_project.application.MarketBookApplication;
import chapter21_mini_project.model.MarketBookData;
import chapter21_mini_project.repository.InMemoryMarketBookRepository;

public class DefaultMarketBookService implements MarketBookService {
	MarketBookApplication mma;
	GenericMarketBookRepositoryInterface<MarketBookData> repository;
	
	public DefaultMarketBookService() {}
	public DefaultMarketBookService(MarketBookApplication mma) {
		this.mma = mma;
		this.repository = new InMemoryMarketBookRepository();
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
	
	/**
	 * 도서 수정
	 * 도서 수정 시 정보 일부 수정 후 반환
	 */
	public MarketBookData crateBook(MarketBookData book) {
		System.out.println("도서명 > ");
		book.setBtitle(mma.scan.next());
		
		System.out.println("저자 > ");
		book.setBauthor(mma.scan.next());
		
		System.out.println("부제 > ");
		book.setBsubname(mma.scan.next());
		
		System.out.println("구분 > ");
		book.setBdivision(mma.scan.next());
		
		System.out.println("가격 > ");
		book.setBprice(mma.scan.nextInt());
		
		return book;
	}
	
	@Override
	public void bookRegister() {
		MarketBookData book = crateBook();
		if(repository.insert(book) == 1) {
			System.out.println("도서 등록 완료");
		} else {
			System.out.println("도서 등록 실패");
		}
		mma.showBookMenu();
	}
	
	@Override
	
	public void bookList() {
		if(repository.getCount() != 0) {
			List<MarketBookData> library = repository.findAll();
			System.out.println("-------------------------------------------------");
			library.forEach(book -> {
				System.out.print(book.getBisbn() + "\t");
				System.out.print(book.getBtitle() + "\t");
				System.out.print(book.getBprice() + "\t");
				System.out.print(book.getBauthor() + "\t");
				System.out.print(book.getBsubname() + "\t");
				System.out.print(book.getBdivision() + "\t");
				System.out.print(book.getBdate() + "\n");
			});
			System.out.println("-------------------------------------------------");
		} else {
			System.out.println("도서는 존재하지 않습니다.");
		}
		mma.showBookMenu();
	}


	@Override
	public void bookSearch() {
		if(repository.getCount() !=0) {
			System.out.println("도서번호 > ");
			String bisbn = mma.scan.next();
			MarketBookData book = repository.find(bisbn);
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
	public void bookUpdate() {
		if(repository.getCount() != 0) {
			System.out.println("도서 아이디 > ");
			String no = mma.scan.next();
			MarketBookData book = repository.find(no);
			if(book != null) {
				repository.update(crateBook(book));
				printBook(book);
			} else {
				System.out.println("검색한 도서가 없습니다.");
			}
		} else {
			System.out.println("등록된 도서가 존재하지 않습니다.");
		}
		mma.showBookMenu();
	}
	
	@Override
	public void bookDeleete() {
		if(repository.getCount() != 0) {
			System.out.println("도서 아이디 > ");
			String bisbn = mma.scan.next();
			MarketBookData book = repository.find(bisbn);
			if(book != null) {
				repository.remove(bisbn);
				System.out.println("도서 삭제 완료");
			} else {
				System.out.println("검색한 도서는 존재하지 않습니다.");
			}
		} else {
			System.out.println("등록된 도서가 존재하지 않습니다.");
		}
		mma.showBookMenu();
	}
	
	@Override
	public void crateBookExit() {
		System.out.println("시스템이 종료되었습니다.");
		repository.close();
		System.exit(0);
	}
	
	@Override
	public int getCount() {
		return repository.getCount();
	}

	public void printBook(MarketBookData book) {
		System.out.println("-------------------------------------------------");
		System.out.print(book.getBisbn() + "\t");
		System.out.print(book.getBtitle() + "\t");
		System.out.print(book.getBprice() + "\t");
		System.out.print(book.getBauthor() + "\t");
		System.out.print(book.getBsubname() + "\t");
		System.out.print(book.getBdivision() + "\n");
		System.out.println("-------------------------------------------------");
	}
}
