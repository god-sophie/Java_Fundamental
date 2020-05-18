package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		// 클래스 객체 생성
		// Customer => 타입
		// c1 => 변수(래퍼런스)
		// new Customer() => 객체생성
		
		Customer c1 = new Customer();
		c1.name = "한지혜";
		c1.email = "jhhan0374@gmail.com";
		c1.phone = "010-7574-0374";
		c1.balance = "10_000_000";
		c1.isReleased = false;
		
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);
		
		Customer c2 = new Customer();
		c2.name = "이나래";
		c2.email = "skfofl@naver.com";
		c2.phone = "010-2737-7887";
		c2.balance = "1_000_000";
		c2.isReleased = false;
		
		System.out.println(c2.name); 
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
		
		Customer c3 = c2;
		c3.name = "바보";
		
		System.out.println(c2.name);
		System.out.println(c3.name);
		
	}
	
}
