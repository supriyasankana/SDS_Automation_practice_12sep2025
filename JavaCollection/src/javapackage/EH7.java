package javapackage;

public class EH7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	int i = 20 / 2;
} finally {
	System.out.println("finally will always execute");
	try {
		int h=5/0;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
System.out.println("Exception handled");
	}

}
