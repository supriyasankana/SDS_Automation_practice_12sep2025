package javacollectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//ArrayList <Integer> al=new ArrayList<Integer>();
		//ArrayList<String>al=new ArrayList<String>();
		//List al=new ArrayList();
		
		//addition of new elements in arraylist
		al.add("Scott");
		al.add(1);
		al.add(true);
		al.add('A');
		al.add(10.5);
		System.out.println("Total arraylist element  "+al);// [Scott, 1, true, A, 10.5]
		
		//size
		
		System.out.println("Number of elements in arraylist " + al.size());
		
		//remove
		al.remove(2);
		System.out.println("total arraylist element after removing elem "+al);
		
		//1. reading element by using for loop
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//2. for ech loop
		for(Object e:al) {
			System.out.println(e);
		}

		//3 Iterator
		System.out.println("Reading element using iterator method");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//removeall
		
		al.removeAll(al);
		System.out.println("after removing all elements  "+ al.isEmpty());
	}

}
