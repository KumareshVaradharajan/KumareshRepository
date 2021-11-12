package StringPrograms;

import org.testng.annotations.Test;

public class CountNumberofCharInString {
	
	@Test
	public void CountCharacter()
	{
		int count =0;
		String s1 = "abcd abcdbabcdb";
		
		for(int i=0; i<s1.length(); i++)
		{
		if(s1.charAt(i)=='b')
		{
			count++;
		}
		}
		
		System.out.println(count);
	}

}
