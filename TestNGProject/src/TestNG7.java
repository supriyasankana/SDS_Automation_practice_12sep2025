import org.testng.annotations.Test;

public class TestNG7 {
	@Test (groups="regression") 
	public void a() {
		System.out.println("hello a method");
	}
	
	
	@Test(groups="regression")
	public  void b()
	{
		System.out.println("hello b method");
	}
	@Test(groups={"regression","smoke"})
	public void c()
	{
		System.out.println("hello c method");
	}
	@Test(groups= {"regression","sanity"})
	public void d()
	{
		System.out.println("hello d method");
	}
}
