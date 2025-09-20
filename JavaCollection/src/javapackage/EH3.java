package javapackage;

public class EH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Selenium";
try {
	int i = Integer.parseInt(s);
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Exception Handled");
	}

}
