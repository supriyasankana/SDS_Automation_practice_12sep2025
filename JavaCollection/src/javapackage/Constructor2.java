package javapackage;

public class Constructor2 {

	int id;//global variable
	String name;//global variable
	String address; //global variable
	
	//default constructor
	Constructor2(){
		System.out.println("Hello default constructor");
	}
	
	//Parameterized Constructor
	Constructor2(int a,String b,String c){
		id=a;
		name=b;
		address=c;
	}
	
	//non static method
	public void displayInfo()
	{
		System.out.println(id +" "+name+" "+address+" ");
	}
	
	public static void main(String[] args) {
		//default constructor
		Constructor2 c2=new Constructor2();
		//parameterized constructor
		Constructor2 c3=new Constructor2(1,"John","UK");
		c3.displayInfo();
	}
}
