import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	//@Test   1st way of skipping test case
	public void a() {
		System.out.println("hello a method");
	}
	
	//2nd way widely used in market
	@Test(enabled=false)
	public  void b()
	{
		System.out.println("hello b method");
	}
	@Test(enabled=true)
	public void c()
	{
		System.out.println("hello c method");
	}
	//re-run script 2 times
	@Test(invocationCount=2)
	public void d()
	{
		System.out.println("hello d method");
	}
	//re-run script 0 times
	@Test(invocationCount=0)
	public void e()
	{
		System.out.println("hello e method");
	}
	
	//conditional skip
	@Test
	public void f()
	{
		System.out.println("hello f method");
		throw new SkipException("Skipping f test method");
	}
}
