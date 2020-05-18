package java_20200515;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "watermelon","blueberry"};
		
		String[] temp = new String[6];
		
		/*
		temp[2] = fruits[0];
		temp[3] = fruits[1];
		temp[4] = fruits[2];
		temp[5] = fruits[3];
		*/
		
		
		System.arraycopy(fruits, 0, temp, 2, 4);
		// fruits => 원본배열
		// 0 => 원본배열의 위치
		// temp => 복사할 배열
		// 2 => 복사할 배열의 위치
		// 4 => 원본배열의 4개 요소를 복사
		
		temp[0] = "peach";
		temp[1] = "pear";
		
		System.out.println(temp[0].length());
		
		// 인덱스 출력하고 싶을때
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		// 배열에 있는 값을 싹다 출력. 100프로
		for(String value : temp) {
			System.out.println(value);
		}
	
	
	
	
	}
}
