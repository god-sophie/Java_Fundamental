package java_20200514;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기
		 * 1. 1년 1월 1일 월요일
		 * 2. 1년은 365일 이고, 윤년일 때는 366일(2월 29일)
		 * 3. 윤년은 4년마다 발생. 그중에 100의 배수는 제외하고, 400배수는 제외하지 않는다.
		 * 4. 2020년 5월 12일은 무슨요일일까?
		 * 5. 2019년까지 총 일수 + 4월까지 총 일수 + 12 더해서 7로
		 *    나눈 나머지가 1이면 월요일, 2이면 화요일, ....
		 * 1년 364.24
		 *
		 * (2019*35+((2019/4 2019/100 + 2019/400))
		 * + 31 + 29 + 31 + 30 + 12) % 7
		 */
		
		int year = 2020;
		int month = 1;
		int day = 25;
		int totalCount = 0;
		int rest = 0;
		
		int preYear = year -1;
		
		// 2019년 총 일수
		totalCount = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		int [] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// 윤년인지 아닌지 판단이 필요 윤년이면 배열의 1번째를 29로 바꿔야함
		// monthArray배열에서 year이 윤년인지 아닌지를 판단.
		// 4의 배수는 윤년이고, 100의 배수는 윤년이 아니고, 400의 배수는 윤년이다.
		/* 
		 *내가 한 코딩 이 더좋댕ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ
		if((year%4 == 0 && year%100 != 0 || year%400 == 0)) {
			monthArray[1] = 29;
		}
		*/
		
		// 선생님 코딩
		// true , false , false => false
		boolean isLeafYear = year%4 == 0 && year%100 != 0 || year%400 == 0;
		
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		for(int i = 0; i < month-1; i++) {
			totalCount += monthArray[i];
		}
		
		// 2019년 1월 ~ 4월까지 총 일수
		//totalCount += 31 + 29 + 31 + 30;
		
		// 2019년 5월 12일의 12일까지 총 일수
		totalCount += day;
		
		rest = totalCount % 7;
		String message = null;
		if(rest == 1) {
			message = "월요일";
		}
		else if(rest == 2) {
			message = "화요일";
		}
		else if(rest == 3) {
			message = "수요일";
		}
		else if(rest == 4) {
			message = "목요일";
		}
		else if(rest == 5) {
			message = "금요일";
		}
		else if(rest == 6) {
			message = "토요일";
		}
		else if(rest == 7) {
			message = "일요일";
		}
		
		
		System.out.println(year +"년" + month + "월" + day + "일은" 
													+ message+ "입니다.");
	}
}
