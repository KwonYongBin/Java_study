package kbank;

public class KBBankTest {

	public static void main(String[] args) {
		BankSystem kbsystem = new BankSystem("KB");
		kbsystem.showAccountList();
		
		AccountPaperVo accountPaper = AccountPaperVo.getInstance();
		
		BankMan staffPark = new BankMan("박보검", kbsystem); //은행 직원은 고객리스트 정보 가짐
		
		Customer hong = new Customer("홍길동", "kb-1234", null, 0);
		boolean valisateFlag = true;
		hong.setAccountPaper(accountPaper);
		staffPark.setAccountPaper(hong.getAccountPaper());
		staffPark.validateCheck();

		while (valisateFlag) {
			if(staffPark.validateCheck(hong.answer(staffPark.checkResult))) {				
				valisateFlag = false;
			}
		}
		
		staffPark.processWithdrawal();
	
		kbsystem.confirmBalance(hong.getAccountPaper()); //은행 시스템을 이용하여 잔액을 확인
		
	}

}