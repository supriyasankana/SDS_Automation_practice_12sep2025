package javapackage;

public class EH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int i=10/0;
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally {
	System.out.println("finally will execute always");
}
	}

}
