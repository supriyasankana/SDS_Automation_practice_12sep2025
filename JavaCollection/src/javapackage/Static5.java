package javapackage;

public class Static5 {
	int x=10;//global variable
	static int y=5;//static variable
	
	//non-static method
	public void a() {
		int z=15; //local variable
		System.out.println(z);//15
	}
	
	static int b=6;//static variable
	//static method
	
	public static void b() {
		int a=5;//local variable
		System.out.println(a);//5
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Static5 s5=new Static5();
		s5.a();//15
		System.out.println(s5.b); //6 not an appropriate way
		System.out.println(Static5.b);//6 not an appropriate way
		System.out.println(b);//6 this is the appropriate way
		System.out.println(Static4.z); //5 correct way for another class static member calling
		b();
		System.out.println(s5.x);//10
		System.out.println(y);//5
	}

}
