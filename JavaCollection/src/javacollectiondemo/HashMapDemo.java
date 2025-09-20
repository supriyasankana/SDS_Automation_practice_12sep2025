package javacollectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap m = new HashMap();
		HashMap <Integer,String> m=new HashMap<Integer,String>();
		
		m.put(101,"John");
		m.put(102,"scott");
		m.put(103,"XYZ" );
		m.put(104,"mahi");
		m.put(105,"supriya");
		m.put(103,"ABC");
		m.put(106,"John");
		
		System.out.println(m); //{101=John, 102=scott, 103=XYZ, 104=mahi, 105=supriya}
		
		System.out.println(m); //{101=John, 102=scott, 103=ABC, 104=mahi, 105=supriya}
		
		System.out.println(m.get(101)); //John
		
		m.remove(106);
		System.out.println(m); //{101=John, 102=scott, 103=ABC, 104=mahi, 105=supriya}
		
		System.out.println(m.containsKey(107)); //false
		System.out.println(m.containsKey(103)); //true
		System.out.println(m.containsValue("supriya")); //true
		System.out.println(m.containsValue("Dhiraj"));//false
		System.out.println(m.isEmpty()); //false
		System.out.println(m.size()); //5
		System.out.println(m.keySet()); //[101, 102, 103, 104, 105]
		System.out.println(m.values()); //[John, scott, ABC, mahi, supriya]
		System.out.println(m.entrySet()); //returns all the entries as set [101=John, 102=scott, 103=ABC, 104=mahi, 105=supriya]
		
		// 1 way reading map
		/*System.out.println("reading map");
		 for (Object i:m.keySet())
		 {
			 System.out.println(i +"    " +m.get(i));
		 } */
		
		//2nd way
		
		for(Object i:m.values())
		{
			System.out.println(i);
		}

//Entry methods
		for(Map.Entry entry : m.entrySet())
		{
			System.out.println(entry.getKey() + "   "+entry.getValue());
		}
		
		System.out.println("using iterator method");
		//iterator()
		Set s= m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}

	}

}
