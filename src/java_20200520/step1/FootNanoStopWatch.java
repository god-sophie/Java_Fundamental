package java_20200520.step1;
//나노 세컨드로 경과시간을 알려주는 애플리케이션 만들어주세요.
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000;
	}
	public double getElapsedNanoTime() {
		return (double)(endNanoTime - startNanoTime) / 1_000_000_000;
	}
	public static void main(String[] args) {
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		
		f1.startNanoTime = System.nanoTime();
		for(long i=0;i<20000_000_000l;i++) {
			
		}
		f1.endNanoTime = System.nanoTime();
		
		double elapsedTime = f1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f",elapsedTime);
	}

}