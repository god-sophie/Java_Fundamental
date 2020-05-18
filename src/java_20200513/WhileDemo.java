package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		
		// 1부터 10까지의 합을 구하는 while 문
		int sum = 0;	
		int i=1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.\n",sum);
		
		
		// 구구단을 while 문으로 작성하시오.
		
		i=2;
		
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);
				j++;
			}
			i++;
		}
		
	}
}
