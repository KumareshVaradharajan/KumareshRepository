package StringPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class StringToDate {
	
	@Test
	public void CovertStringtodate() throws ParseException
	{
		String sDate1="31/12/1998";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);
	    
	    
	   
		
	}
	
	@Test
	public void TodaydateandTime()
	{
		 Date date = Calendar.getInstance().getTime();
		    System.out.println(date);
	}

}
