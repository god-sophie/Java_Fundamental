package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.2);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		long l1 = Math.round(42.5);	// 매개변수가 double값이면 반환값은 long
		System.out.println(l1);
		
		d1 = 45.67;
		
		// 소수점 2자리에서 반올림하기 => 45.7 출력하기
		
		d1 *= 10;	// 456.7
		
		l1 = Math.round(d1);
		d1 = (double)l1 / 10;	// 소수점을 표현하기 위해 double 사용
		
		System.out.println(d1);
		
		int a1 = (int)Math.round(43.5);
		a1 = Math.abs(-123);
		System.out.println(a1);
		
		d1 = Math.sqrt(3);		// 제곱근
		System.out.println(d1);
		
		d1 = Math.pow(2, 3);	// 2의 3제곱
		System.out.println(d1);
		
		d1 = Math.random() * 45; // 0<random<45 	Lotto class 참조
		System.out.println(d1);
		
	}
}
