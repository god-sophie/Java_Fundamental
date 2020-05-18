package java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {
		// 1. 배열선언 및 생성
		int [] a = new int[4];
		
		// 2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		// 3. 배열 출력
		// a.length : 배열의 길이
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 배열 선언, 생성, 할당을 동시에 이루어짐
		int[] b = {100,200,300,400,500};
		
		// 배열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		// 배열 출력 index를 표시하면서 출력할 수 있음
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		// 배열 출력 => enhanced for loop
		
		for(int value : b) {
			System.out.println(value);
		}
		
		int[] c = a;
		c[0] = 11;
		System.out.println(a[0]);
		System.out.println(c[0]);
		
	}
}
