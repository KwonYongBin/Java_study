package chapter07;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton singleton = new Singleton(); 기본 생성자가 private으로 접근이 제어 됨
		
		Singleton singleton = Singleton.getInstance(); //private으로 접근이 제어됐을 때에는 method를 통해 객체를 생성한다.
		singleton.setName("싱글톤");
		System.out.println("name : "+ singleton.getName()); 
	}

}
