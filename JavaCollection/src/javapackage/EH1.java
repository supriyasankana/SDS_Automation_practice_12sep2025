package javapackage;

public class EH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int a=5/0; //java.lang.ArithmeticException
}
catch(ArithmeticException a) {
	a.printStackTrace(); // optional but print complete exception info
	System.out.println(a);
}
catch(NullPointerException n) {
	System.out.println(n);
}
catch(ArrayIndexOutOfBoundsException b) {
	System.out.println(b);
}catch(Exception e) {
	System.out.println(e);
}
System.out.println("Hello");
	}

}
