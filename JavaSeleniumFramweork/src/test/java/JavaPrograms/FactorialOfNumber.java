package JavaPrograms;

import org.testng.annotations.Test;

public class FactorialOfNumber {
	
	@Test
	public void factorial()
	{
		int num =4;
		
		for(int i=num-1; i>=1; i--)
		{
			num=num*i;
		}
		System.out.println(num);
		
	}

}
