package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		System.out.println("==========================");
		
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();			// ?? 부모것을 호출할 수 없음. 오버라이딩 했기 때문
		s2.age = 20;		// 부모의것을 그대로 쓸수없으니 재설정
		System.out.println(s2.age);
		s2.playBadook();
		
		System.out.println("==========================");
		
		Super s3 = new Sub();		// s3는 Super의 멤버변수만 접근가능
		
		//Super s3 = s2;		// s2가 가르키는 곳을 s3
				System.out.println(s3.age);
		s3.playBadook();
		s3.work();
		
		//s3.height = 20; 	// 자식거는 절대 쓸수없음. work만 사용가능한데 오버라이딩했기 때문임.
		//s3.playGame();	// 이하동문.
	}

}
