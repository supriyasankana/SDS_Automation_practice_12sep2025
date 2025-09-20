package javapackage;

public class IfElse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=25;//local variable
		int weight=55;//local variable
		
		//Outer if statement
		if (age>18)
		{
			//Inner if statement
			if (weight>50) {
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		else
		{
			System.out.println("Age is not greater than 18");
		}

	}

}
