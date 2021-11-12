package StringPrograms;

import org.testng.annotations.Test;

public class GetCharsMethod {
	
//public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex) 
	
	@Test
	public void getCharsImplement()
	{
		String s1 = "ImplementingTestNGFramework";
		
		char[] c = new char[20];
		s1.getChars(0, 12, c, 0);
		System.out.println(c);
		
		
	}

}
