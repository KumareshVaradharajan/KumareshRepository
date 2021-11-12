package StringPrograms;

import org.testng.annotations.Test;

public class CaptializefirstWord {
	
	@Test
	public void capitalTheFirstWord()
	{
		
		String s1 = "i love my country";
		String[] s2 = s1.split("\\s");
		String NewString = "";
		
		
		for(String s: s2)
		{		
		System.out.println(s);
		
		String first = s.substring(0, 1);
		String rest = s.substring(1);
		
		NewString+= first.toUpperCase()+rest+" "; 
		
		}
		
		System.out.println(NewString);
		
		System.out.println(NewString.trim());
	}

}
