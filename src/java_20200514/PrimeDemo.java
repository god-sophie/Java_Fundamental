package java_20200514;

public class PrimeDemo {
	public static void main(String[] args) {
		// 1~100 소수 구하기
		
		//i-> 1~100까지의 변수
				//number -> i가 소수인지 확인하기 위한 변수
				//sum-> 소수의 합을 나타내는 변수
				int i, sum = 0;
				int number = 0;
				
				// 1~100까지의 소수 구하기
				for (i = 2; i <= 100; i++) {
					for (int j = 2; j <= i; j++) {
						if (i % j == 0) {
							number++;
						}
					}
					if (number == 1) {
						System.out.print(i + " ");
						sum += i;
					}
					number = 0;
				}
				System.out.println();
				System.out.println("1~100까지의 소수의 합은" + sum + "입니다.");
	}
}
