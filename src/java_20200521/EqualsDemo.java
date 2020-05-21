package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2);				// false
		System.out.println(s1.equals(s2));		// true
		
		Customer c1 = new Customer("한지혜","서울");
		Customer c2 = new Customer("한지혜","서울");
		
		// equals 가 true 가 나오면 hashcode값이 똑같아짐.
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));		// 오버라이딩이 필요함(Customer 클래스에서)
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.toString());	// 오브젝트것을 쓰기 때문에  레퍼런스를 찍으면 문자열이 튀어나옴
		System.out.println(s1);				// 문자열이 나오는데 오버라이딩 했기 때문에
	}
}
