package java_20200518;

public class MethodOverloadingDemo {
	// MethodOverloadingDemo 클래스에서는 print 메소드를 4가지로 오버로딩
	// 오버로딩 작성규칙
	// 1. 같은 클래스 내에서
	// 2. 메소드 이름은 같아야 한다.
	// 3. 매개변수 갯수가 같으면 자료형이 달라야 한다.
	// 4. 매개변수 갯수가 달라야 한다.
	// 5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.
	public void print(String str) {
		System.out.print(str);
	}
	
	public void print(int i) {
		System.out.print(i);
	}
	
	public void print(double d) {
		System.out.print(d);
	}
	
	public void print(boolean b) {
		System.out.print(b);
	}
	// 매개변수를 다양하게 variable argument
	public void test(int...a) {
		for(int temp : a) {
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.print("hello");
		m.print(100);
		m.print(10.34);
		m.print(true);
		m.test(1);
		m.test(1,2);
		m.test(1,2,3);
	}
}
