package StringPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringReversal {
	
	//@Test
	public void StringRevSimple()
	{
		String s1="Hello";
		
		StringBuilder sb = new StringBuilder(s1);
		String s2 = sb.reverse().toString();
		System.out.println(s2);
		
	}
	
	//@Test
	public void StringReverseManual()
	{
		String s1 = "World";
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
	
	
}
