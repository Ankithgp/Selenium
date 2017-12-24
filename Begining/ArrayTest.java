package Begining;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;


public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String presentDate = sd.format(new Date());
		System.out.println(presentDate);
		
		
		Scanner scan = new Scanner (System.in);
		
		int a[][][]=new int [3][4][5];
		int i,j,k;
		
		for  (i=0; i<=a.length-1; ++i)
		{
			for (j=0; j<=a[i].length-1; ++j)
			{
				for (k=0; k<=a[i][j].length-1 ; ++k )
					System.out.println("enter school , class , students");
					a[i][j][k]= scan.nextInt();
			}
		}
		
		for (i=0; i<=a.length-1; ++i)
		{
			for (j=0; j<=a[i].length-1; ++j)
			{
				for (k=0; k<=a[i][j].length-1; ++k)
				{
					System.out.println(a[i][j][k]);
				}
			}
		}
	}
}
