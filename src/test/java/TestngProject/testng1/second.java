package TestngProject.testng1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class second {
	
	@Test
	public void demo()
	{
		System.out.println("this is first test of second class");
	}
	
	@BeforeTest
	public void second1()
	{
		System.out.println("this is second test of second class");
	}
	
	@AfterSuite
	public void third()
	{
		System.out.println("this is last suit");
	}
	

}
