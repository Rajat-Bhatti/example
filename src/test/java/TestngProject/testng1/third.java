package TestngProject.testng1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class third {
	@BeforeSuite
	public void demo()
	{
		System.out.println("this is the first suite");
	}
	
	@Test
	public void second()
	{
		System.out.println("this is second test of third class");
	}
	
	@Test
	public void third1()
	{
		System.out.println("this is third test of third class");
	}
	

}
