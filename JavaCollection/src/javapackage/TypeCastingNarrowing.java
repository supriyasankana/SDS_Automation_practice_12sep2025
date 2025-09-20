package javapackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//double to int conversion
		double b=5.9;
		int a=(int) b;//Manual casting
		System.out.println(b);//5.9
		System.out.println(a);//5
		
		//String to int conversion
		String s="10";
		int i=Integer.parseInt(s);
		System.out.println(i);//10
		
		//int to String conversion
		int z=5;
		String t=String.valueOf(z);
		System.out.println(t.length());//1
		System.out.println(t);
	}

}
