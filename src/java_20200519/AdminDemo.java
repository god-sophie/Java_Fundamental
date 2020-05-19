package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin("jhhan0374","1111","jhhan0374@gmail.com",1);
	
		// a.id ="jhhan0374"; 직접 변경이 안됨	// id가 private 이기 때문에
//		a.setId("jhhan0374");
//		a.setPwd("1111");
//		a.setEmail("jhhan0374@gmail.com");
//		a.setLevel(1);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
	
		Admin a1 = new Admin("jhhan5555","2222","jhhan5555@gmail.com");
	
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
	}
}
