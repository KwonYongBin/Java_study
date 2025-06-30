package chapter06;

import java.util.Arrays;

/*
 * 배열 복사 : for, System.arraycopy(), Arrays.copyOf()
 *
 System.arrayCopy()
 public static void arraycopy(
	 Object src,
	 int srcPos,
	 Object dest,
	 int destPos,
	 int length
 )
 */

public class ArrayCopyTest {

	public static void main(String[] args) {
		// 1. for
		int [] arrInt = {1, 2, 3};
		int [] arrInt2 = new int [5];
		int [] arrInt3 = new int [3]; // System.arraycopy()
		// int [] arrInt4 = new int [3]; Arrays.copyOf()
	
		for(int i = 0; i < arrInt.length; i++) {
			arrInt2[i] =  arrInt[i];
		}
		
		for (int i= 0; i < arrInt2.length; i++) System.out.print(arrInt2[i] + "\t");

		// 2. System.arraycopy()
		// System.arraycopy()
		// public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(arrInt, 0, arrInt3, 0, arrInt.length);
		System.out.println();
		for (int i= 0; i< arrInt3.length; i++) System.out.print(arrInt3[i] + "\t");
		
		
		// 3. Arrays.copyOf()
		// public static boolean[] copyOf(boolean[] original, int newLength)
		int [] arrInt4 = Arrays.copyOf(arrInt, arrInt.length);
		System.out.println();
		for (int i= 0; i< arrInt4.length; i++) System.out.print(arrInt4[i] + "\t");
		
	}

}
