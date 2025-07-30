package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConn {
	//Field
	
	private String url = "jdbc:mysql://127.0.0.1:3306/hrdb2019";
	private String user = "root";
	private String password = "mysql1234";
	
	Connection connection;
	protected Statement stmt; //같은 패키지 안에서만 공유 가능
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	//Field
	
	//Constructor
	protected DBConn() {
		try {
			//1,2 단계
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("-----> 1단계 성공!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Constructor
	
	//Method
	
	//Statment 생성
	public void getPreparedStatement(String sql) {
		//2단계 : Statement 객체 생성
		try {
			pstmt = connection.prepareStatement(sql); // 선호 정보 보안에 대해서 강함
			System.out.println("-----> 2단계 성공!!");
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	//Statment 생성
	public void getStatement() {
		//2단계 : Statement 객체 생성
		try {
			stmt = connection.createStatement();
			System.out.println("-----> 2단계 성공!!");
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	//객체 종료
	public void close() {
		try {
			if(stmt != null) rs.close();
			if(stmt != null) stmt.close();
			if(connection != null) connection.close();
		} catch (Exception e) {	e.printStackTrace(); }
	}
	
	//Method
	
}//class





















