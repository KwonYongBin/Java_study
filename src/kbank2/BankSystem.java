package kbank2;

public class BankSystem {
	String name;
	AccountVo[] accountList;
	
	public BankSystem(String name) {
		this.name = name;
		accountList = createAccountList(); //은행 고객 리스트 생성
	}
	
	/**
	 * 고객의 계정 정보 출력
	 */
	public void confirmBalance(AccountPaperVo accountPaper) {
		int resultIdx = -1;
		for(int  i = 0; i < accountList.length; i++) {
			AccountVo account = accountList[i];
			if(account.getAccountNumber().equals(accountPaper.getAccountNumber())
					&& account.getPassword().equals(accountPaper.getPassword())) {
				resultIdx = i;
				break;
			}
		}
		if (resultIdx != -1) {
			System.out.println("==========================================");
			System.out.println(accountList[resultIdx].getName() + "\t");
			System.out.println(accountList[resultIdx].getAccountNumber() + "\t");
			System.out.println(accountList[resultIdx].getPassword() + "\t");
			System.out.println(accountList[resultIdx].getBalance() + "\t");
			System.out.println("==========================================");
			System.out.println("[BankSystem] 이용해주셔서 감사합니다.");
		}else {
			System.out.println("[BankSystem] 일치하는 고객정보가 없습니다.");			
		}
	}
	
	/**
	 * 계정 검색
	 */
	public int searchAccount(AccountPaperVo accountPaper) {
		int resultIdx = -1;
		
		for(int i = 0; i < accountList.length; i++) {
			AccountVo account = accountList[i];
			if(account.getAccountNumber().equals(accountPaper.getAccountNumber())
					&& account.getPassword().equals(accountPaper.getPassword())) {
				resultIdx = i;
				break;
			}
		}
		return resultIdx;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
