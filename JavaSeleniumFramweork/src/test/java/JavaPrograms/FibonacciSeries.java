package JavaPrograms;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	@Test
	public void fibonnaci()
	{
		int a=0,b=0,c=1,total=10;
		
		for(int i=0; i<=total; i++)	
		{
			
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}

}
