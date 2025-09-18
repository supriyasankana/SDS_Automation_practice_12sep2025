import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test
	public void z()
	{
		Assert.assertTrue(3<12);
		System.out.println("hello Z method");
	}
	
	@Test
	public void a()
	{
		Assert.assertTrue(3>12);
		System.out.println("Hello a method");
	}
	
	@Test(dependsOnMethods= {"z","a"})
	public void b() {
		System.out.println("hello b method");
	}
}
