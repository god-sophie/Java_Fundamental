package java_20200520.step2;

public class StopWatch {
	// 밀리세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	// 밀리세컨드의 경과시간
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000;	// 소수점 이하 셋째 자리
	}
	
	// 시작시간을 관리하는 메소드
	public void start() {
		startTime = System.currentTimeMillis();
	}
	// 끝 시간을 관리하는 메소드
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	// 나노세컨드를 관리하기 위한 변수
	long startNanoTime;
	long endNanoTime;
	
	// 나노세컨드의 경과시간
	public double getElapsedNanoTime() {
		return (double)(endNanoTime - startNanoTime) / 1_000_000_000;	// 소수점 이하 아홉째자리까지
	}
	
	// 시작시간을 관리하는 메소드	
	public void startNano() {
		startTime = System.nanoTime();
	}
	// 끝 시간을 관리하는 메소드
	public void stopNano() {	
		endTime = System.nanoTime();
	}
}
