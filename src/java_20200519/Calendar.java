package java_20200519;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	private int getCount(int year, int month, int day) {
		int totalCount = 0;
		
		int preYear = year-1;
		//2019년 총일 수
		totalCount = preYear * 365 + 
				(preYear/4 - preYear/100 + preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면
		//monthArray의 두번째 방의 값을 29로 변경해야 한다.
		
		// 4의 배수는 윤년이고, 100의 배수는 윤년이 아니고, 400배수는 윤년이다.
		boolean isLeafYear =
				year%4==0 && 
				year%100 != 0 || 
				year%400==0;
		
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		
		for(int i=0;i<month-1;i++) {
			totalCount += monthArray[i];
		}
		
		//2019년 1월 ~ 4월까지 총일 수
		//totalCount += 31 + 29 + 31 + 30;
		
		//2019년 5월 12일의 12일 까지 총일 수
		totalCount += day;
		
		return totalCount;
	}
	
	public void printCalendar(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//2020년 5월 1일 날짜를 구해서 일부터 1일 이전 날짜까지 빈공백 처리
		
		int totalCount = getCount(year,month,1);
		int rest = totalCount % 7;
		
		for(int i=0;i<rest;i++) {
			System.out.print("\t");
		}
		
		for(int i=1;i<=getLastDay(year,month);i++) {
			System.out.print(i+"\t");
			rest++;
			if(rest%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	public void printCalendarYear(int year) {
		for(int i=1;i<=12;i++) {
			printCalendar(year, i);
		}
	}
	
	private int getLastDay(int year, int month) {
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면
		//monthArray의 두번째 방의 값을 29로 변경해야 한다.
		
		// 4의 배수는 윤년이고, 100의 배수는 윤년이 아니고, 400배수는 윤년이다.
		boolean isLeafYear =
				year%4==0 && 
				year%100 != 0 || 
				year%400==0;
		
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		return monthArray[month-1];
	}
	
	public void print() {
		int totalCount = getCount(year, month, day);
		int rest = totalCount % 7;
		String message = null;
		if(rest == 1) {
			message = "월요일";
		}else if(rest == 2) {
			message = "화요일";
		}else if(rest == 3) {
			message = "수요일";
		}else if(rest == 4) {
			message = "목요일";
		}else if(rest == 5) {
			message = "금요일";
		}else if(rest == 6) {
			message = "토요일";
		}else if(rest == 0) {
			message = "일요일";
		}
		
		
		System.out.println(year+"년 "+month+"월 "+day+" 일은 "+
		message+" 입니다.");
	}
	
	
}