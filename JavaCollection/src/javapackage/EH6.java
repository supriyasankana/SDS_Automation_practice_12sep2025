package javapackage;

public class EH6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
		} finally {
			System.out.println("finally will execute always");
		}
	}

}
