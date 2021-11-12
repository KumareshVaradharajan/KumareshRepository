package StringPrograms;

import org.testng.annotations.Test;

public class MergeFirstCharOfEachWord {
	
	@Test
	public void FirstcharofeachWord()
	{
		String s1 = "This is my first program";
		String S2="";
		
		String[] s = s1.split(" ");
		
		for(String str : s)
		{
			
		System.out.println(str);
		String first = str.substring(0, 1);
		S2+=first;
		}
		
		System.out.println(S2);
		
	}

}
