package javacollectiondemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
	
		//HashSet hs = new HashSet(100); //initial capacity 100
		//HashSet hs =new HashSet(100,(float)0.90);
		//HashSet <Integer> hs =new HashSet<Integer>();
		HashSet hs =new HashSet(); //default capacity 16,Load Factor 0.75
		
		//add element
		 hs.add("Welcome");
		 hs.add(11);
		 hs.add(13.7);
		 hs.add('A');
		 hs.add(true);
		 hs.add(null);
		 
		 System.out.println("Total hashset elements "+ hs); //  [A, Welcome, 11, 13.7, true] insertion order not preserved
		 
		 //remove
		 hs.remove(11);
		 System.out.println("After removing the element "+ hs);
		 
		 //contains()
		 System.out.println(hs.contains("Welcome")); // returns true
		 System.out.println(hs.contains("XYZ")); // returns false as XYZ is not present in hashset
		 
		 //isEmpty()
		 
		 System.out.println(hs.isEmpty()); // returns false
		 
		 // Reading objects/elements from hashset by using for each loop
		 
		 for (Object e:hs)
		 {
			 System.out.println(e);
		 }
		 
		 // 2. reading elements by using iterator method
		 System.out.println("Reading hashset by using iteratior method");
		 Iterator itr=hs.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println( itr.next()); 
		 }
		 
	}

}
