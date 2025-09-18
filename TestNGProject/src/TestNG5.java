import org.testng.annotations.Test;

public class TestNG5 {
	@Test   
		public void a() {
			System.out.println("hello a method");
		}
		
		
		@Test(invocationCount=2,priority=-1,enabled=true & false)
		public  void b()
		{
			System.out.println("hello b method");
		}
		@Test(enabled=true)
		public void c()
		{
			System.out.println("hello c method");
		}
}
