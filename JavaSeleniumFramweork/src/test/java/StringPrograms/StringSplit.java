package StringPrograms;
import org.testng.annotations.Test;

public class StringSplit {
	
	@Test
	public void SplitStringMethod()
	{
		String s1 = "oh My god";
		String str[] = s1.split(" ");
		
		for(String s: str)
		{
			System.out.println(s);
			
		}
		
	}
	
	@Test
	public void SplitwithPositive2()
	{
		String s1 = "Hello My World universe  ";
		String str[] = s1.split(" ", 2);
		
		for(String s: str)
		{
			System.out.println(s);
			
		}
	}

	@Test
	public void SplitwithPositive5()
	{
		String s1 = "Hello My World universe  ";
		String str[] = s1.split(" ", 5);
		
		for(String s: str)
		{
			System.out.println(s);
			
		}
	}

	@Test
	public void SplitwithNegative2()
	{
		String s1 = "Hello My World universe  ";
		String str[] = s1.split(" ", -2);
		
		for(String s: str)
		{
			System.out.println(s);
			
		}
	}
	
	@Test
	public void SplitwithNegative5()
	{
		String s1 = "Hello My World universe  ";
		String str[] = s1.split(" ", -5);
		
		for(String s: str)
		{
			System.out.println(s);
			
		}
	}
	
//It will split based on reg exp and remove all the suffix spaces	
	@Test
	public void SplitwithZero()
	{
		String s1 = "Hello My World universe  ";
		String str[] = s1.split(" ", 0);
		
		for(String s: str)
		{
			System.out.println(s);
			
		}
	}

}
