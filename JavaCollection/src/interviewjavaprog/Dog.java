package interviewjavaprog;

public class Dog extends Animal{
	Dog(){		
		super("dog");		
		}		
		public void makesound(){		
		System.out.println("Woof");		
		}		
		public void printdogname(){		
		System.out.println("print dog NAME:"+this.name);		
		}		
	public static void main(String[] args) {
		Dog dg=new Dog();	
dg.makesound();			
dg.makesound(10);			
dg.printdogname();			

	}

}
