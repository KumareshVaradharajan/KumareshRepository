package StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class OnlyuniqueWords {
	
	@Test
	public void PrintUniqueWords()
	{
		String s = "java is great. But python is also great.";
		String s2 = "";
		System.out.println(s);
		
		String [] sa = s.split(" ");
		
		Set<String> st = new LinkedHashSet<String>();
		for(int i=0; i<sa.length; i++)
		{
			st.add(sa[i]);
		}
		
	//	System.out.println(st);
		
		Iterator itr = st.iterator();
		while(itr.hasNext())
		{
			s2+=itr.next()+" ";
		
		}
		System.out.println(s2);
	}

}
