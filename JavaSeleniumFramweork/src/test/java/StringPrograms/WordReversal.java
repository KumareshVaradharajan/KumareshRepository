package StringPrograms;

import org.testng.annotations.Test;

public class WordReversal {

	@Test
	public void WordReverse()
	{
		String s1 ="good day", s2="";
		
		String[] sa = s1.split(" ");
		
		for(int i=sa.length-1; i>=0; i--)
		{
			s2+=sa[i]+" ";
		}
		System.out.println(s2);
	}
}
