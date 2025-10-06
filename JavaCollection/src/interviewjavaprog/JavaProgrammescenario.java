package interviewjavaprog;

public class JavaProgrammescenario {

	public static void main(String[] args) {
		/*Find the count of occurrence of letter 'o' also replace it with 't'
		Input:  I am going to Zoo too
		output1: 6
		output2:  I am gting tt Ztt ttt */

		String str="I am going to Zoo too";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='o')
				count++;
			
		}
		
		String newstr=str.replace('o', 't');
		System.out.println(count);
		System.out.println(newstr);
	}
}
