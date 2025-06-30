package chapter05;

import java.util.Scanner;

public class StudentGradeManagement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name = "", specialty =""; // 이름, 전공
		int stuNo = 0, grade = 0, kLang = 0, math = 0, eng = 0; //학번, 국어, 수학, 영어
		boolean stuFlag = true;
		
		while(stuFlag) {
			
			System.out.println("======= 학생 성적 관리 시스템 =======");
			System.out.println("\t 1. 학생 등록");
			System.out.println("\t 2. 학생 목록 조회");
			System.out.println("\t 3. 학생 성적 검색");
			System.out.println("\t 4. 성적 수정");
			System.out.println("\t 5. 학생 삭제");
			System.out.println("\t 9. 종료");
			System.out.println("================================");
			System.out.print("메뉴 입력 => ");
            int menu = input.nextInt();
            input.nextLine(); // 엔터 처리
			
            if(menu == 1) {
            	System.out.println("[학생 등록]");
            	System.out.print("이름 입력 => ");
            	name = input.next(); // 문자는 .next() 메서드를 사용
            	
            	System.out.print("학번 입력 => ");
            	stuNo = input.nextInt(); // 정수는 .nextInt() 메서드를 사용
            	
            	System.out.print("학년 입력(숫자) => ");
            	grade = input.nextInt();
            	
            	System.out.print("전공 입력 => ");
            	specialty = input.next();
            	
            	System.out.print("국어 점수 입력 => ");
            	kLang = input.nextInt();
            	
            	System.out.print("수학 점수 입력 => ");
            	math = input.nextInt();
            	
            	System.out.print("영어 점수 입력 => ");
            	eng = input.nextInt();
            	
            	System.out.println("[등록 완료]");
            	System.out.println("이름 : " + name + "\n학번 : " + stuNo + "\n학년 : " + grade + "학년 " + "\n전공 : " + specialty + "\n국어 점수 : " + kLang + "\n수학 점수 : "+ math + "\n영어 점수 : " + eng);
            	
            } else if(menu == 2) {
            	System.out.println("[학생 목록 조회]");
            	
            	if(stuFlag) {
            	
            } else if(menu == 3) {
            	System.out.println("[학생 성적 검색]");
            	if(stuFlag) {     		
            	}
            	
            } else if(menu == 4) {
            	System.out.println("[성적 수정]");
            	if(stuFlag) {    		
            	}
            	
            } else if(menu == 5) {
            	System.out.println("[학생 삭제]");
            	if(stuFlag) {   		
            	}
            	
            } else if(menu == 9) {
            	System.out.println("[프로그램을 종료합니다.]");
            	if(stuFlag) {
            		System.exit(9);
            	}
            	
            }
			
			
		}

		
	}

	}
}
