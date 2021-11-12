package StringPrograms;

import org.testng.annotations.Test;

public class NoOfVowelsInAString {
	
	@Test
	public void NoOfVowelsIfNoSpace()
	{
		String s1 = "AEIOUGTHaeiou";
		String temp= "";
		
	   String[] str =  s1.split("[ AEIOUaeiou]+");
	   
	   for(int i=0; i<str.length; i++)
	   {
		
		temp = str[i];
		System.out.println(temp);  
	   }
	   
	   int len = s1.length()-(temp.length());
	 System.out.println(len);
	   
	}
	
	@Test
	public void NoOfVowelsIfSpace()
	{
		String s = "AEIOUGTH aeiou";
		String s1= s.toLowerCase();
		int count=0;
		
	 for(int i=0; i<s1.length(); i++)
	 {
		if(s1.charAt(i) == 'a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
		{
			count++;
		}
	 }
	 
	 System.out.println(count);
	   
	}

}
