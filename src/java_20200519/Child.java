package java_20200519;

public class Child extends Parent{
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	
	public void play(String starcraft) {
		//super.play(starcraft);
		System.out.println("Child play()");
	}
	
	public void setParentMoeny(int money) {
		super.money = money;
	}
	
	public int getParentMoney() {
		return super.money;
	}
}