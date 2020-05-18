package java_20200518;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	
	public void m1() {
		// instance 메소드에서는 instance 변수, static 변수 모두 사용가능
		// instance 메소드에서는 instance 메소드, static 메소드 모두 호출가능
		this.name = "한지혜";		// this = 자기 자신 객체
		StaticMethodDemo.interestRate = 4.2;
		this.m2();
		StaticMethodDemo.m4();	// 서로다른 클래스에 있는 static 이라면 저렇게 해야함
	}
	public void m2() {
		System.out.println("m2() 인스턴스 메소드 호출");
	}
	
	public static void m3()	{
		// static 메소드에서는 static 변수만 사용가능, instance 변수 사용불가
		// static 메소드에서는 static 메소드만 호출 가능, instance 메소드 호출 불가
		// static 메소드에서는 this 를 사용할 수 없음.
	//	name = "홍길동";
		StaticMethodDemo.interestRate = 3.9;
	//	m2();
		StaticMethodDemo.m4();
		
		// static 메소드에서 instance 변수와 instance 메소드를 호출하려면
		// 객체를 생성해서 사용해야 한다.
		
		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "한지혜";
		m1.m2();
	}
	
	public static void m4()	{
		System.out.println("m4 static 메소드 호출");
	}
	
	public static void main(String[] args) {
		StaticMethodDemo.m4();
		StaticMethodDemo.m3();
		StaticMethodDemo.interestRate = 4.3;
		
		StaticMethodDemo m = new StaticMethodDemo();
		m.m1();
		m.m2();
		m.name = "황기령";
	}
	
}
