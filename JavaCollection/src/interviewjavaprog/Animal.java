package interviewjavaprog;

public class Animal {
	String name;		
	Animal(String name){		
	this.name=name;		
	System.out.println("Animal Name:"+name);		
	}		
	public void makesound(){		
			
	System.out.println("Generic animal sound");		
	}		
	public void makesound(int volume){		
	System.out.println("volume="+ volume);		
	}		
}
