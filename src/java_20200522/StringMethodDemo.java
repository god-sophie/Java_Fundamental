package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "941203-2222222";
		// charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);
		
		// concat(String msg) : 문자열 연결
		ssn = ssn.concat("abcd");	// ssn + "abcd";
		System.out.println(ssn);
		
		// endsWith(String msg) : msg문자열로 끝나면 true, or false
		String fileName = "abcd.doc";
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		
		// startsWith(String msg) : msg 문자열로 시작하면 true, or false
		String url = "http://www.naver.com";
		String path = "/news/sss.do?id=123";
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		// equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고 
		// 문자열을 비교하여 같으면 true, or false
		boolean success = fileName.equalsIgnoreCase("abcd.doc") ;
		System.out.println(success);
		
		// indexOf(String msg) : msg 문자열의 위치를 반환
		int index = ssn.indexOf("-");	// 941203-2222222
		System.out.println(index);
		
		// lastIndexOf(String msg) : msg 문자열의 위치를 마지막에서 시작하여 찾고
		// index는 처음부터  msg 문자열까지 index를 반환.
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
		// 배열의 길이 : length, 문자열의 길이 : length()
		// trim() : 앞뒤 문자열 공백제거
		String dbId = "jhhan0374".trim();
		String userId = "jhhan0374 ".trim();
		System.out.println(dbId);
		System.out.println(dbId.length());
		System.out.println(userId);
		System.out.println(userId.length());
		System.out.println(dbId.equals(userId));
		System.out.println(dbId.equalsIgnoreCase(userId));
		System.out.println(dbId == userId);
		
		// substring(int frist, int last)
		// first(포함) 부터 second(포함 하지 않음)
		// substring(int first)
		// first(포함) 보다 큰 모든 문자열을 추출
		fileName = "abc.doc";
		String first = fileName.substring(0,fileName.indexOf("."));
		String last = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(first);
		System.out.println(last);
		
		// replaceAll(String first, String second)
		// first 문자열을 second 문자열로 대체
		String html = "안녕하세요\n저는 한지혜 입니다.\n잘 부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		// toUpperCase() : 대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();
		
		System.out.println(m1);
		
		// toLowerCase() : 소문자로 변환
		
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		// String.valueOf(~) : primitive data type을 문자열로 변환
		
		char[] c1 = {'a','b','c'};
		String msg = String.valueOf(true);	// "true"
		
		System.out.println(msg);
		
		String[] str = ssn.split("-");
		String ssn1 = str[0];
		String ssn2 = str[1];
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		String str2 = String.format("%,.2f", 123123.4567);	// printf랑 똑같이 생각
		System.out.println(str2);
		
		
		// format 메소드 공부하깅>_<
		str2 = String.format("%3$f %2$f %1$f", 1234.45, 123345.5680, 34234.590);
		System.out.println(str2);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
