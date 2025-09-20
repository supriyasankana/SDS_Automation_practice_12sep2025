package javapackage;

public class LogicalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;//local variable
		int b=5;//local variable
		int c=20;//local variable
		
		//Logical operator- if 1st condition is false , 2nd condition will not check
		System.out.println(a<b && a++ < c);//false
		System.out.println(a);//10
		
		//Bitwise Operator - It will check all conditions
		System.out.println(a <b & a++ < c);//false
		System.out.println(a); //11

	}

}
