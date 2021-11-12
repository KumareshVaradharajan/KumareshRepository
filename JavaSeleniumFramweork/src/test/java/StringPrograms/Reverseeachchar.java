package StringPrograms;

import org.testng.annotations.Test;

public class Reverseeachchar {
	
	@Test
	public void ReveachWord()
	{
		
		String s1 = "hello world program";
		
		String[] str = s1.split(" ");
		String s2="";
		
		
		for(String s : str)
		{
			System.out.println(s);
			StringBuilder sb = new StringBuilder(s);
			s2+=sb.reverse().toString()+" ";
			
		}
		System.out.println(s2);
	}

}
