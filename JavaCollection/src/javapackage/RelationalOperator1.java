package javapackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=300;//local variable
		int b=300;//local variable
		
		if (a!=b)
		{
			System.out.println("a is not equal to b");
		}
		else
		{
			System.out.println("a is equal to b");
		}

		String p="HELLO";
		String q="hello";
		//String comparison - 1st way -casesensitive
		if(p==q)
			System.out.println("p and q are equal for 1st way");
		else
			System.out.println("p and q are not equal for 1st way");
		//string comparison - 2nd way - case sensitive
		if (p.equals(q))
		{
			System.out.println("p and q are equal for 2nd way");
		}
		else
			System.out.println("p and q are not equal for 2nd way");
		//string comparison - 3rd way - not case sesitive
		if(p.equalsIgnoreCase(q))
			System.out.println("p and q are equal for 3rd way");
		else
			System.out.println("p and q are not equal for 3rd way");
	}

}
