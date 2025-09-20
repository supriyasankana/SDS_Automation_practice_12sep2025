package javapackage;

public class MethodOverride2 extends MethodOverride1 {

	public void eat() {
		System.out.println("you are eating");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverride2 mo2 = new MethodOverride2();
		//MethodOverride1 mo2 = new MethodOverride2(); // at any case child class method will give preference
		mo2.eat();

	}

}
