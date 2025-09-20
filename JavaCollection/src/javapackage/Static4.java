package javapackage;

public class Static4 {
	static int z=5; //static variable
	int y=1;//global variable
	//static method
	public static void a()
	{
		z=10;//modification of static value
		System.out.println(z); //10
	
	}
	
	//non static method
	public void b()
	{
		z=15;
		System.out.println(z);//15
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(z);//5
		a();//10
		Static4 s4=new Static4();
		s4.b(); //15
		
	}

}
