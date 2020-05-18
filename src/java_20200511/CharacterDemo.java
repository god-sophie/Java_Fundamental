package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		
		// 1. 유니코드 표현 => '\u0000'
		char c1 = '\uD55C';
		char c2 = '\uC9C0';
		char c3 = '\uD61C';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		// println -> 한줄씩띄어서,  print -> 그냥 출력
		
		// 2. 아스키코드 표현
		// 48 - 57 => 0 - 9
		// 65 - 90 => A - Z
		// 97 - 122 => a - z
		char c4 = 97;	// 아스키코드표현
		System.out.println(c4);
		
		// 3. 문자 표현법
		char c5 = '성';
		System.out.println(c5);
		
		char c6 = '\'';
		char c7 = '\\';
		char c8 = '\"';
		String s1 = "\\";
		String s2 = "\"";
		String s3 = "\'";
		

		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		
		System.out.println("aa"+'\t'+"bb");		// tab(문자와 문자사이 탭)
		System.out.println("aa"+'\n'+"bb");		// line feed(줄바꿈)
		System.out.println("aa"+'\r'+"bb");		// carriage return
	
	}
}
