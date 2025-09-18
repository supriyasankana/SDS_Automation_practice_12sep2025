import org.testng.annotations.Test;

public class TESTNG2 {
@Test
public void shammi() {
	System.out.println("hello shammi");
}
@Test(priority = 0)
public  void tummy()
{
	System.out.println("hello tummy");
}
@Test(priority = -5)
public void mummy()
{
	System.out.println("hello mummy");
}
@Test(priority = 1)
public void pummy()
{
	System.out.println("hello pummy");
}
}
