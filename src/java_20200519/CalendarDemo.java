package java_20200519;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = new Calendar(2020,6,25);
		c.print();
		c.printCalendar(2020,4);
		c.printCalendarYear(2020);
	}
}