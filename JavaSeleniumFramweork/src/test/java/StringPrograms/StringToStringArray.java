package StringPrograms;

import org.testng.annotations.Test;

public class StringToStringArray {
	
	@Test
	public void ConvertStringToStrArray()
	{
		String s1 = "Oh My String";
		
		String str[] = s1.split("k");
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
			
		}
		
	
	}

}
