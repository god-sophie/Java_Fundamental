package java_20200519;

public class CallRefValueDemo {
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 4000;
	}
	
	public static void main(String[] args) {
		int i = 10;
		int [] j = {1,2,3,4};
		
		System.out.println(i +"," + j[3]);
		
//		int l = i;
//		l = 20;
		
//		int[] k = j;
//		k[3] = 4000;
		
		change(i,j);	// i => call by vaule, j => call by reference
		
		System.out.println(i + "," + j[3]);
		
		int a = 10;
		double b = 10.0;
		// primitive == primitive => 값 비교
		System.out.println(a==b);
		
		int[] a1 = {1,2,3,4};
		int[] b1 = {1,2,3,4};
		// ref == ref => 두 ref가 같은 객체를 참조하는 지를 판단
		// 같은 객체를 참조하면 true, 아니면 false
		System.out.println(a1==b1);
		
	}
}
