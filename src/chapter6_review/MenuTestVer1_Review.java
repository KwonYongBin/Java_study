package chapter6_review;

import java.util.Scanner;

public class MenuTestVer1_Review {

	public static void main(String[] args) {
		
		//변수 or 객체 선언
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 갯수 > ");
		final int MAX_SIZE = scan.nextInt();
		
		String[] nameList = new String[MAX_SIZE];
		String[] emojiList = new String[MAX_SIZE];
		int[] priceList = new int[MAX_SIZE];
		
		//메뉴 등록/출력/검색/검토
		boolean menuFlag = true;
		int menu = 0;
		int menuCount = 0;
		while(menuFlag) {
			System.out.println("-----------------------------------------");
			System.out.println("더조은 레스토랑 메뉴 관리 프로그램");		
			System.out.println("-----------------------------------------");
			System.out.println("1. 메뉴 등록");		
			System.out.println("2. 메뉴 리스트 출력");		
			System.out.println("3. 메뉴 검색");		
			System.out.println("9. 프로그램 종료");		
			System.out.println("-----------------------------------------");
			System.out.print("메뉴선택(숫자)> ");
			menu = scan.nextInt();
			
			//메뉴체크
			if(menu == 1) {
				//저장공간의 크기 만큼 반복수행, 메뉴하나 등록 왼료시 카운트 변수 1추가
				//저장공간의 크기가 부족함ㄴ 메시지 출력 후 종료
				for(int i=0; i<menuCount; i++) {
					System.out.println("메뉴명 > ");
					nameList[i] = scan.next();
					
					System.out.println("이모지 > ");
					emojiList[i] = scan.next();
					
					System.out.println("가격 >");
					priceList[i] = scan.nextInt();
					
					menuCount ++;
					
					if(menuCount == MAX_SIZE) {
						System.out.println("=> 저장공간 부족, 등록 종료!!");
					} else {
						System.out.print("계속 등록?(계속:아무키나누르세요, 종료:n)> ");
						if(scan.next().equals("n")) {
							i = MAX_SIZE; //break;
							System.out.println("=> 등록 완료!!");
						}
					}
				}
			} else if(menu == 2){
				if(menuCount != 0) {
					//Step3 : 데이터 출력
					System.out.println("-----------------------------------------");
					System.out.println("메뉴명\t이모지\t가격");		
					System.out.println("-----------------------------------------");
					for(int i=0; i < nameList.length; i++) {
						if(nameList[i] != null) { //메뉴명이 null이 아닌 경우에만 출력
							System.out.println(nameList[i] + "\t");
							System.out.println(emojiList[i] + "\t");
							System.out.println(priceList[i] + "\n");
						}
					}
					System.out.println("-----------------------------------------");
				} else {
					System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요.");
				}
			} else if(menu == 3) {
				if(menuCount != 0) {
					boolean searchFlag = true;
					while(searchFlag) {
						System.out.println("검색 메뉴명>");
						String searchMenu = scan.next();
						int searchIdx = -1;
						for(int i=0; i<menuCount; i++) {
							if(searchMenu.equals(nameList[i])) searchIdx = i;
						}
						System.out.println("searchIdx : " + searchIdx);
						
						//출력 : searchIdxr가 -1이 아닌 경우
						if(searchIdx == -1) {
							System.out.println("=> 검색 메뉴 없음!!");
						} else {
							System.out.println("-----------------------------------------");
							System.out.println("메뉴명\t이모지\t가격");		
							System.out.println("-----------------------------------------");
							System.out.println(nameList[searchIdx]);
							System.out.println(emojiList[searchIdx]);
							System.out.println(priceList[searchIdx]);
							System.out.println("-----------------------------------------");
						}
						
						System.out.print("계속 검색?(계속:아무키나누르세요, 종료:n)> ");
						if(scan.next().equals("n")) {
							searchFlag = false;
							System.out.println("=> 검색 종료!!");
						}
					}
						
					}else {
						System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요.");
					}
				
				} else if (menu == 9){
					System.out.println();
				}
			}
		}

}



















