package StringPrograms;

import org.testng.annotations.Test;

public class CovertStringToInt {
	
	@Test
	public void StringToint()
	{
		String s1 ="12345";
		
		Integer i = new Integer(s1);
		int Number = i.intValue();
		System.out.println(Number);
	}
	
	
	@Test
	public void InttoString()
	{
		int a = 54321;
		Integer in = new Integer(a);
		String s1 = in.toString();
		System.out.println(s1);
	}

}
