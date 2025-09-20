package interviewjavaprog;

import java.util.HashSet;

public class RemoveDupCharFromString {

	public static void main(String[] args) {
	
		String str="supriya dhiraj sankana";
		HashSet hs=new HashSet();
		StringBuilder newstr= new StringBuilder();
		for (char c:str.toCharArray())
		{
			if(hs.contains(c)==false)
			{
				hs.add(c);
				newstr.append(c);
			}
		}
		
		System.out.println(newstr);
	}

}
