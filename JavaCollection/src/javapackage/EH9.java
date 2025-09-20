package javapackage;

public class EH9 {
public static void a(int age) throws Exception {
	try {
		if (age<18) {
			throw new EH8CustomException("Age is less than 18,not eligible");
		}
		else {
			System.out.println("eligible");
		}
	} catch (EH8CustomException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args) throws ArithmeticException,Exception {
	a(15);
	a(25);
}
}
