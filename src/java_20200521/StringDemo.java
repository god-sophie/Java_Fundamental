package java_20200521;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);
		// equals() 메소드가 true가 나오는 이유는 object 클래스의 equals() 메소드를 오버라이딩 했기 때문.
		// 객체 안의 문자열 비교 했기 때문.
		System.out.println(s1.equals(s2));
		
		String s3 = "world";
		String s4 = "world";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}
	
	
	
	
	/*public static void change(int x, int[] array, String str) {
		x = 20; 
		array[0] = 10;
		str = str + "1234";
		System.out.println(str);
	}
	public static void main(String[] args) {
		int a = 10;
		int [] b = {1,2,3};
		String str = "abc";
		
		change(a,b,str);
		
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(str);
		
		
	}
	*/
}
