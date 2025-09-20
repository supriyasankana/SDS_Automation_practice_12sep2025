package javapackage;

public class Methodoverride4 extends MethodOverride3 {
	public void run()
	{
		System.out.println("You are running");
	}

	public static void main(String[] args) {
		Methodoverride4 mo4 = new Methodoverride4();
		mo4.run();
		MethodOverride3 mo3 = new MethodOverride3();
		mo3.run();
	}
}
