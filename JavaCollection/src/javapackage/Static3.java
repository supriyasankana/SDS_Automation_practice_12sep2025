package javapackage;

public class Static3 {
	int roll; //global variable
	String name; //global variable
	static String college="IIM Ahemdabad"; //static variable
	//constructor
	Static3(int r ,String n)
	{
		roll=r;
		name=n;
	}
	public void getResult()
	{
		System.out.println(roll + " " + name + " "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Static3 s3=new Static3(1,"John");
Static3 s4 = new Static3(2,"Shammi");
s3.getResult();
s4.getResult();
	}

}
