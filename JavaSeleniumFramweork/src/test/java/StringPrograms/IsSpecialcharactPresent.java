package StringPrograms;

import org.testng.annotations.Test;

public class IsSpecialcharactPresent {
	
	@Test
	public void IsSpecialcharacterPresent()
	{
		String s = "We are checking for ";
		
		for(int i=0; i<s.length(); i++)
		{
		if(!(Character.isAlphabetic(s.charAt(i)) || (Character.isDigit(s.charAt(i))) || (Character.isSpace(s.charAt(i)))))
				{
			System.out.println("Special characters are present");
				}
		else
		{
			System.out.println("Special characters are NOT present");
		}
				
		}
	}

}
