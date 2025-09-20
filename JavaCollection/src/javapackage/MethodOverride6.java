package javapackage;

public class MethodOverride6 extends MethodOverride5 {
	public void cook()
	{
		System.out.println("Mom is cooking");
	}
	public void angry()
	{
		System.out.println("Father is angry");
	}
	
	public static void main(String[] args) {
		MethodOverride5 mo5 = new MethodOverride6(); //dynamic method dispatch (creating object of child call by giving reference of parent class
		
		mo5.cook();
		mo5.eat();
		mo5.handwash();
		//mo5.angry()  - undefined because of dynamic method dispatch concept
		
		MethodOverride6 mo6=new MethodOverride6();
		mo6.angry();
		
	}

}
