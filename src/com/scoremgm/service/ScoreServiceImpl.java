package com.scoremgm.service;

import java.util.Random;
import java.util.Scanner;

public class ScoreServiceImpl implements ScoreService {
	Scanner scan;
	
	public ScoreServiceImpl() {}
	public ScoreServiceImpl(Scanner scan) {
		this.scan = scan;
	}
	public void register() {
		System.out.print("학생명 > ");
		String name = scan.next();
		
		System.out.print("전공 > ");
		String department = scan.next();
		
		System.out.print("국어 > ");
		int kor = scan.nextInt();
		
		System.out.print("영어 > ");
		int eng = scan.nextInt();
		
		System.out.print("수학 > ");
		int math = scan.nextInt();
		
		//학번 생성 : 2025-랜덤 4자리
		String no = createNo();
		System.out.println("no -> " + no);
		
		//Member 생성
	}
	
	/**
	 * 학번 생성
	 */
	public String createNo(){
		String no = "2025-";
		Random rd = new Random();
		
		return no += rd.nextInt(1000, 9999);
	}	
	public void list() {}
	public void search() {}
	public void update() {}
	public void delete() {}
	public void exit() {}
}
