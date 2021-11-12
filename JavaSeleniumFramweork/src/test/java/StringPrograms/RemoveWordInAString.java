package StringPrograms;

import org.testng.annotations.Test;

public class RemoveWordInAString {
	
	@Test
	public void RemoveAWord()
	{
		String s1 = "oh my god", s2="";
		
		String[] str = s1.split(" ");
		
		for(String temp : str)
		{
			if(!temp.contains("my"))
			{
				s2+=temp+" ";
			}
		}
		
		System.out.println(s2);
	}

}
