package java_20200513;

public class SelfStudy {
	public static void main(String[] args) {
		// 1~100까지 짝수,홀수의 합
		int a = 0;	// 짝수
		int b = 0;	// 홀수 
		
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				a += i;
			}else {
				b += i;
			}
		}
		System.out.printf("짝수의 합은 %d \n",a);
		System.out.printf("홀수의 합은 %d\n\n\n\n\n",b);
		
		// 별 출력
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별 다섯개
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
