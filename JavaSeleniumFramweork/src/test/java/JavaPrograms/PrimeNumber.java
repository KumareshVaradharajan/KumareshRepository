package JavaPrograms;

import org.testng.annotations.Test;

public class PrimeNumber {
	
	@Test
	public void primeOrNot()
	{
		
		int num = 7;
		boolean flag = true;
		
		for(int i=2; i<num; i++)
		{
		if(num%i==0)
		{
			flag = false;
		}
		}
		
		if(flag==false)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
		
	}

}
