package javapackage;

public class Variable8 {

	int b=10; //global variable
	static int c=5; //static variable
	
	//static method
	public static void d()
	{
		int e=15; //local variable
		System.out.println(e); // 15-calling local variable
		
	}
	
	//non-static method
	public void f()
	{
		int g=5; //local variable
		System.out.println(g); //5
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6; //local variable
		System.out.println(a); //6 local variable calling

		//calling static member
		
		System.out.println(c); //5
		d();
		
		//calling non-static member
		Variable8 v8=new Variable8();
		System.out.println(v8.b); //10- calling non-static variable using class reference
		v8.f(); // 5 -calling non-static method using class ref
	}

}
