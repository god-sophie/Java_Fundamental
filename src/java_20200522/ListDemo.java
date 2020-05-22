package java_20200522;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		// ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		// 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 할당
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		// 출력
		for(int i = 0; i < list.size(); i++) {
			Integer i1 = list.get(i);
			System.out.println(i1);
		}
		
		// list 모두 삭제 => remove(int index)
		
		for(int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		
		// enhanced for loop 출력 가능(Generic으로 선언한 경우만 가능)
		for(Integer value : list) {
			System.out.println(value);
		}
		
		int[] temp = {1,2,3,4};
		
		// enhanced for loop는 배열을 출력할 때 사용가능
		for(int v : temp) {
			System.out.println(v);
		}
		
	}
}
