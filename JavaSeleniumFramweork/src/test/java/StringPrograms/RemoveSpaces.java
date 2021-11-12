package StringPrograms;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveSpaces {
	
	@Test
	public void SpaceRemovalInString()
	{
		
		String s1 = "I Love chennai";
		String s2= s1.replaceAll("\\s", "");
		System.out.println(s2);
				
	}

}
