package java_20200514;

public class Homework {
	public static void main(String[] args) {
		
		// 1~100까지 소수 출력하기
		int [] number = new int [100];
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count += 1;
				}
			}
			if(count==2) {
				System.out.println(" "+i);
				}
		}
	}
}
