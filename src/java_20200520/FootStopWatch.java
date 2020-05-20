package java_20200520;

public class FootStopWatch {

	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000;
	}
	
	public static void main(String[] args) {
		
		FootStopWatch f1 = new FootStopWatch();
		
		// 1970년 1월 1일 부터 지금까지 시간을 밀리 세컨드로 반환.
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 20000_000_000l; i++) {
			
		}
		
		long endTime = System.currentTimeMillis();
		
		double elapsedTime = (double)(endTime - startTime) / 1000;
		
		System.out.printf("경과시간 : %d", elapsedTime);
		
	}
}
