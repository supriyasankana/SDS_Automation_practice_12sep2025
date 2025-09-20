package javapackage;

public class Static6 {
 String a; //global variable
 int b; //global variable
 static int c=4; //static variable
 //static method
 
 public static void a()
 {
	 System.out.println("Hello static");
 }
 public static void main(String args[])
 {
	 Static6 s6=new Static6();
	 s6.a="Selenium";
	 s6.b=1;
	 c=2;
	 a();//Hello static
	 System.out.println(s6.a);//selenium
	 System.out.println(s6.b);//1
	 System.out.println(c);//2
	 
	 
	 
 }
}
