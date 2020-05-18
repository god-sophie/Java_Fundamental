package java_20200512;

public class OperatorDemo {
	public static void main(String arg[]) {
		int a = 10, b= 22;
		int c = 0;
		double d = 0;
		
		c = a + b;
		System.out.println(c);
 		c = a - b;
		System.out.println(c);
		
		// 자동으로 casting 되어버림
		d = b / a;
		System.out.println(d);
		
		d = (double)b/a;
		System.out.println("더블로 형변환 한 경우의 값 : "+d);
		
		c = a*b;
		System.out.println(c);
		
		// 나머지 연산자
		c = b % a;
		System.out.println(c);
		
		a += b;	// a = a+b;
		System.out.println(a);
		
		int sum = 0;
		
		for(int i=1;i<=100;i++)	{
			sum += i;		// sum = sum + i;
		}
		System.out.println(sum);
		
		a = 10;
		b = 20;
		
		a++;	// a = a+1;
		++b;	// b = b+1;
		
		System.out.println(a);	// 11
		System.out.println(b);	// 21
		
		// 대입 후 증가
		c = a++;				// c => 11 
		System.out.println(c);
		
		// 증가 후 대입				
		c = ++b;				// c => 22
		System.out.println(c);
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		// Primitive data type의 == 연산자는 자료형에 상관없이 값만 같으면 true를 반환한다.
		isSuccess = a == d;
		System.out.println(isSuccess);

		isSuccess = a != d;
		System.out.println(isSuccess);
		
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		a = 10;
		b = 20;
		
		// a && b => a가 false이면 b를 연산하지 않음(short circuit)
		// a || b => a가 true이면 b를 연산하지 않음(short circuit)
		
		isSuccess = (a == b) && (++a == b++);	// 앞에가 false이기 때문에 뒤에는 연산도 안함
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		
		// + => 연결연산자 (두개 중 1개 이상이 문자열일 경우)
		// 산술연산자 (두개 모두 숫자일 경우)
		
		System.out.println(1+2+3+"456");
		System.out.println("123"+4+5+6);
		
		System.out.println("123"+4+(5+6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
