package java_20200522;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args) {
		// ctrl + shift + o
		// 1. 선언 및 생성
		HashSet set = new HashSet();
		// HashSet 객체의 중복을 허용하지 않고, 순서 없음.
		// 2. 할당
		set.add(1);		// object에는 1이 안들어가지만 primitive를 refer로 자동 박싱하기 때문에 가능
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
	
	//	System.out.println(set.size());
		// 3. 출력
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Integer number = (Integer)i.next();
			System.out.println(number);
		}
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("한지혜1"));
		set1.add(new Customer("한지혜2"));
		set1.add(new Customer("한지혜3"));
		set1.add(new Customer("한지혜1"));
		
		System.out.println("size : " + set1.size());
		
		// 로또 복권 - HashSet
		
		// TreeSet - 객체의 중복을 허용하지 않음, 오름차순 정렬해줌 (HashSet -> TreeSet 으로 바꾸셈)
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(true) {
			int random = (int)(Math.random() * 45) + 1;
			lotto.add(random);
			if(lotto.size() == 6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
		
		
	}
}
