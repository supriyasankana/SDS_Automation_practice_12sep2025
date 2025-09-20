package javapackage;

public class Encapsulation1 {

	String name; //global variable
	int b; //global variable
	final int c=2; //final variable
	
	public void a() {
		//c=5; - final variable can not be change the value
	}
	
	//final method
	final void d() {
		System.out.println("final method");
	}
	
	public void setName(String s) {
		name=s;
		b=5;
		System.out.println(b);//5
		System.out.println(c);//2
	}
	
	public Object getName() {
		return name;
	}
}
