package basicJavaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class EvenNo {
	
	@Test
	public void EvenOrNot()
	{
		System.out.println("Enter the Number of times the values to be checked:");
		Scanner sc = new Scanner(System.in);
		int TotalNum= sc.nextInt();
		
		for(int i=1; i<=TotalNum; i++)
		{
			System.out.println("S.NO: "+ i);
			Scanner sc1 = new Scanner(System.in);
			int temp = sc1.nextInt();
			
			if(temp%2==0)
			{
				System.out.println("The Number is Even number");
			}
			else
			{
				System.out.println("The Number is ODD number");
			}
		}
		
	}

}
