package StringPrograms;

import org.testng.annotations.Test;

public class RemoveAWordnothavingSpace {
	
	@Test
	public void removeWord()
	{
		String s1 = "ThisProgramIsToRemoveAWord";
		
		//Need to remove a word "Program"
		
		
		String s2 = s1.replaceAll("Program", "");
		
		System.out.println(s2);
	}

}
