package javapackage;

public class MethodOverload2 extends MethodOverload1 {
	public static void main(String[] args) {
		MethodOverload2 m2=new MethodOverload2();
		m2.sum(25, 15);//40
		m2.sum(5, 12, 20);//37
	}

}
