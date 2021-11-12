package StringPrograms;

import org.testng.annotations.Test;

public class ReplaceACharacter {
	
	@Test
	public void ReplaceCharacter()
	{
		String s1 = "aaaaaaacdij";
		String s2 = s1.replace('i', 't');
		String s3 = s1.replace("aa", "ooo");
		String s4 = s1.replaceAll("aa", "ooo");
		String s5 = s1.repeat(3);
		String s6 = s1.replaceFirst("aa", "ooo");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}

}
