package chapter05;

public class FormatTest {

	public static void main(String[] args) {
		int a = 280000000;
		//String aa = String.format("%,d", a);
		String aa = String.format("%,d", new Object[] { Integer.valueOf(a) });
		System.out.println(aa);
	}

}