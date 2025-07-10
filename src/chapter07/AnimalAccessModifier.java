package chapter07;
//public 없이 class만 선언시 default이며 chapter07 package에서만 사용 가능하다.
//public은 어느 곳에서나 접근이 가능하다는 뜻
public class AnimalAccessModifier {
	//Field
	String name; // 같은 패키지에서만 접근 가능
	int age; // 같은 패키지에서만 접근 가능

	private String pname; 	//같은 클래스 내에서만 접근 가능
	private int page; 		//같은 클래스 내에서만 접근 가능
	
	static String sname; // 같은 메모리 영역에 있어야만 호출이 가능하다. (클래스 변수 또는 static 변수
	static int sage;
	
	final String fname = "홍길동"; //final 키워드 적용 => 외부에서 값을 변경할 수 없음
	final int fage = 10;
	
	//상수 정의
	public static final int START = 0;
	static final public int CONTINUE = 1;	
	final public static int END = -1;	
	
	//Constructor
	public AnimalAccessModifier() {}
	public AnimalAccessModifier(String pname, int page) {
		this.pname = pname;
		this.page = page;
	}
	
	//Method
	//static method
	void getInfo() {System.out.println(pname+ ","+ page);} // 같은 패키지 내에서만 사용 가능
	public void getInfo2() {System.out.println(pname+ ","+ page);} // 같은 패키지 내에서만 사용 가능
	public static void getInfo3() {System.out.println(sname+ ","+ sage);} // 같은 패키지 내에서만 사용 가능
	
	
	//getter/setter
	public String getPname() { return pname; }
	public int getPage() { return page; }

	public void setPname(String pname) { this.pname = pname; }
	public void setPname(int page) { this.page = page; }
}
