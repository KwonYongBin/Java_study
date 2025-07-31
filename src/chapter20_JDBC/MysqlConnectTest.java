package chapter20_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnectTest {

	public static void main(String[] args) {
		try {
            // 🔸 0단계 - JDBC 드라이버 설치 및 프로젝트에 반영 (외부 라이브러리 추가 필요)

            // 🔸 1단계 - MySQL 데이터베이스와 연결 (Connection 객체 생성)
            //     - URL 형식: jdbc:mysql://서버주소:포트번호/DB명
            //     - Connection은 자바와 DB를 연결하는 다리 역할
			String url = "jdbc:mysql://127.0.0.1:3306/hrdb2019";
			String user = "root";
			String password = "mysql1234";
			// Connection = mysql과 연결되는 다리역할
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("-----> 1단계 성공!!");
			
            // 🔸 2단계 - SQL 실행을 위한 Statement 객체 생성
			// Statement는 SQL 명령을 DB에 전달하고 실행 결과를 받아옴
			Statement stmt = connection.createStatement();
			System.out.println("-----> 2단계 성공!!");
			
			// 🔸 3단계 - SQL 작성 및 실행, 결과(stmt를 이용하여 ResultSet 받기)
//			String sql = "select emp_id, emp_name, dept_id, salary from employee"
//					+ " where dept_id = 'SYS'";
			
//			StringBuilder sb = new StringBuilder(100);
//			sb.append("select emp_id, emp_name, dept_id, salary from employee");
//			sb.append(" where dept_id = 'SYS'");
			
			// - 템플릿 리터럴(```)은 JDK 15 이상에서 사용 가능 (여러 줄 문자열)
			String sql = """
					select
						row_number() over() as rno,
						emp_id, 
						emp_name, 
					    dept_id, 
					    salary,
					    hire_date
					from employee 
					where dept_id = 'SYS'
				""";
			
			ResultSet rs = stmt.executeQuery(sql);
			if(rs != null) {
				System.out.println("-----> 3단계 성공!!");
				
				//4단계 rs(ResultSet)객체에서 데이터 추출
				System.out.println("-----> 4단계 성공 : 데이터 추출!!");
				while(rs.next()) {
					//List<row가 담기는 객체 : EmployeeVo>
					// 결과의 각 컬럼을 순서대로 출력
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.print(rs.getInt(5) + "\t");
					System.out.print(rs.getDate(6).toLocalDate() + "\n");
				}
			}
			
			// 5단계 : connection, stmt, rs 객체 종료
			// 사용한 DB 자원 정리 (메모리 누수 방지)
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(connection != null) connection.close();
			
			System.out.println("-----> 5단계 성공 : 종료!!");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
