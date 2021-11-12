package StringPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Removeduplicatechar {
	
	@Test
	public void RemoveDup()
	{
		String s1 = "Hello World";
		char[] c = s1.toCharArray();
		String s2 = "";
		System.out.println(c);
		
		Set <Character> s = new  LinkedHashSet<Character>();
		for(int i=0; i<c.length; i++)
		{
		s.add(c[i]);
		}
		
		System.out.println(s);
		
		Iterator i = s.iterator();
	    while(i.hasNext())
	    {
	    	s2+=i.next().toString();
	    }
	    
	    System.out.println(s2);
		
	}

}
