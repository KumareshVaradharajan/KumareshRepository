package StringPrograms;

import org.testng.annotations.Test;

public class NumberReversal {
	
	@Test
	public void NumberReversal()
	{
		int Num = 12345;
		Integer in = new Integer(Num);
		String s1 = in.toString();
		String s2="";
		
		for(int i=s1.length()-1 ; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
		
		Integer inte = new Integer(s2);
	System.out.println(inte.intValue());
	}

}
