package javapackage;

public class Static2 {
	
	static int roll; // Declaring global variable
	static String name; //Declaring global variable
	String college="IIM Ahemdabad"; //Declaring global variable
	int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Static2 s2=new Static2();
 System.out.println(roll);//0
 System.out.println(name);//null
 System.out.println(s2.college);//
 System.out.println(s2.a);
	}

}
