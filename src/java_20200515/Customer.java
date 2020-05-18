package java_20200515;
// Customer 클래스
public class Customer {
	// 클래스의 멤버 변수 - instance 변수, static 변수, final 변수
	// 인스턴스 변수(name, email, phone, balance, isReleased);
	// 객체가 생성될 때만 만들어지는 변수 = 인스턴스 변수
	
	
	public String name;
	public String email;
	public String phone;
	public String balance;
	public boolean isReleased;
	public static double interestRate;	// 이자율
	
	// final 변수는 한번정해지면 못바꿈 멤버변수있는자리에 셋팅하고끝남
	// 상수는 대문자로 쓰는것이 관례
	// 상수는 한번 정해지면 값을 변경할 수 없음.
	// 일반적으로 static final로 사용.
	public static final String BANKNAME = "신한은행";
	
}
