package TestngProject.testng1;

import org.testng.annotations.*;



public class first {
	
	@Test
	public void demo()
	{
		System.out.println("this is the first test of first class");
		
	}
	@Test
	public void second()
	{
		System.out.println("this is second test of first class");
	}
	
	@Test(dataProvider="getData")
	public void third(String username,String password)
	{
		System.out.println("this is third test of first class");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="arun";
		data[0][1]="123";
		data[1][0]="varun";
		data[1][1]="1234";
		data[2][0]="tarun";
		data[2][1]="12345";
		return data;
	}
	

}
