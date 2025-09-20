package javapackage;

public class Constructor3 {
	//Constructor Overloading
	Constructor3()
	{
		System.out.println("No parameter");
	}

	Constructor3(int n)
	{
		System.out.println("int parameter");
	}
	Constructor3(String s)
	{
		System.out.println("String parameter");
	}
	
	public static void main(String[] args) {
		Constructor3 c3=new Constructor3();//no parameter
		Constructor3 c4=new Constructor3(3);//int parameter
		Constructor3 c5=new Constructor3("Hello");//string parameter
		
	}
}
