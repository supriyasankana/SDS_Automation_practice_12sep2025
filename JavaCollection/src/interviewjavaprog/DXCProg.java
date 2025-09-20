package interviewjavaprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DXCProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name = "Supriya, Sankana, DXC, India, DXC";
		 Convert it into LIST
		Sort it in alphabetical order(remove the duplicates)*/
		
		String inputstr="Supriya$, $Sankana, DXC, India, DXC";
		
		String strnocommspace = inputstr.replaceAll("[\\s$,]", "");
		System.out.println(strnocommspace);
		List Li =new ArrayList();
		
		for (char c:strnocommspace.toCharArray())
		{
			if(Li.contains(c)==false)
				Li.add(c);
		}
		
		System.out.println("List Before sorting -->" + Li);
		Collections.sort(Li);
		
		System.out.println("Sorted list  -->"  + Li);
	}

}
