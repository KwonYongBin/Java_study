package chapter21_mini_project.service;

import chapter21_mini_project.application.MarketBookApplication;
import chapter21_mini_project.model.MarketBookData;
import chapter21_mini_project.model.MarketCartData;
import chapter21_mini_project.model.MarketMemberData;
import chapter21_mini_project.repository.InMemoryMarketBookRepository;
import chapter21_mini_project.repository.InMemoryMarketCartRepository;
import chapter21_mini_project.repository.InMemoryMarketMemberRepository;
import chapter21_mini_project.repository.MarketRepositoryInterface;

public class DefaultMarketMemberService implements MarketMemberServise{
	MarketBookApplication mma;
	MarketRepositoryInterface<MarketBookData> booksRepository;
	MarketRepositoryInterface<MarketCartData> cartRepository;
	MarketRepositoryInterface<MarketMemberData> memberRepository;
	String mid;
	
	public DefaultMarketMemberService(MarketBookApplication mma) {
		this.mma = mma;
		booksRepository = new InMemoryMarketBookRepository();
		cartRepository = new InMemoryMarketCartRepository();
		memberRepository = new InMemoryMarketMemberRepository();
	}

	@Override
	public void menuMemberAdd() {
		MarketMemberData member = new MarketMemberData();
		
		System.out.println("회원명 > ");
		member.setName(mma.scan.next());
		
		System.out.println("주소 > ");
		mma.scan.nextLine();
		member.setAddress(mma.scan.nextLine());
		
		System.out.println("연락처 > ");
		member.setPhone(mma.scan.nextLine());
	
		memberRepository.insert(member);
		this.mid = memberRepository.finId();
	}

	@Override
	public void menuMemberInfo() {
		MarketMemberData member = MarketMemberData.find(mid);
		if(member != null) {}
	}

	@Override
	public void menuCartList() {}

	@Override
	public void menuCartClear() {}

	@Override
	public void menuCartAddItem() {}

	@Override
	public void menuCartRemoveItem() {}

	@Override
	public void menuCartBill() {}

	@Override
	public void exit() {
		System.out.println("-- 북마켓을 종료합니다. --");
		
	}
	
}
