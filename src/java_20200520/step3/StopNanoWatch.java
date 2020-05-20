package java_20200520.step3;

public class StopNanoWatch {
	// 나노세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	// 나노세컨드의 경과시간
	public double getElapsedNanoTime() {
		return (double)(endTime - startTime) / 1_000_000_000;	// 소수점 이하 아홉째자리까지
	}
		
	// 시작시간을 관리하는 메소드	
	public void start() {
		startTime = System.nanoTime();
	}
	// 끝 시간을 관리하는 메소드
	public void stop() {	
		endTime = System.nanoTime();
	}
}
