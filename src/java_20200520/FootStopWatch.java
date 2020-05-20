package java_20200520;

public class FootStopWatch {
	public static void main(String[] args) {
		
		// 1970년 1월 1일 부터 지금까지 시간을 밀리 세컨드로 반환.
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 7000_000_000l; i++) {
			
		}
		
		long endTime = System.currentTimeMillis();
		
		long elapsedTime = (endTime - startTime) / 1000;
		
		System.out.printf("경과시간 : %d", elapsedTime);
		
	}
}
