package javacollectiondemo;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
//Hashtable t = new Hashtable(); //declaration
Hashtable<Integer,String> t=new Hashtable<Integer,String>();

t.put(101, "Nishu");
t.put(102, "Kartu");
//t.put(null, "Kau"); //NullPointerException
//t.put(103, null);//NullPointerException

System.out.println(t);
System.out.println(t.get(101));
System.out.println(t.containsKey(101));//true
System.out.println(t.containsKey(103));//false
System.out.println(t.containsValue("Nishu"));//true
System.out.println(t.containsValue("Kau"));//false
System.out.println(t.isEmpty());//false
System.out.println(t.size());
System.out.println(t.keySet());//[102, 101]
System.out.println(t.values());//[Kartu, Nishu]

//reading values

for(Object i:t.keySet())
{
	System.out.println(i +"  "+t.get(i));
}
	}

}
