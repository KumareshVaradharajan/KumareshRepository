package StringPrograms;

import org.testng.annotations.Test;

public class RemoveSpecialcharacters {
	
	
	@Test
	public void RemoveSpecialchar()
	{
		
		String s = "Hello #$%^& World";
		String s2 = "";
		
		String[] str = s.split("[ !@#$%^&*()+=]+");
		
		for(String s1 : str)
		{
			System.out.println(s1);
			s2+=s1+" ";		
			
		}
		
		System.out.println(s2);
	}

}
