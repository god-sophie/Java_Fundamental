package java_20200519;

public class Child extends Parent{
	String chicken;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	public void play(String starcraft) {
	//	super.play(starcraft);
		System.out.println("Child play()");
	}
	
	public void setParentMondey(int money) {
		super.money = money;
	}
	public int getParentMoney() {
		return money;
	}
}
