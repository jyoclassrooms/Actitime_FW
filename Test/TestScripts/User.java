package TestScripts;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class User 
{
	@Test()
	public void Verify_a() throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("a:"+i);
			Thread.sleep(500);
		}
		
	}
	
	
	
}
