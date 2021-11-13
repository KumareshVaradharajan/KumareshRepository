package package1;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	@Test
	public void fib()
	{
		int a=0, b=0, c=1, total=10;
		for(int i=1; i<=total; i++)
		{
			a=b;
			b=c;
			c=a+b;
			
	/*		
			if(c>0 && c%i!=0)
			{
				System.out.println(c);
			}
			
	*/
		}
		
	}

}
