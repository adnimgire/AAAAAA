package array_pack;

import java.util.Arrays;

public class Array_3 {

	public static void main(String[] args) {
		
		
		int a[]= {20,35,15,45,10};
	    int b= a.length;
		     
	    
	    Arrays.sort(a);
	    
	    System.out.println("ascending order");
		for (int i= 0; i<b; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("descending order");
		for(int i= 4; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		
		
		int x[]= {90,40,60,100,70,30,50};
		int y= x.length;
		
		Arrays.sort(x);
		
	    System.out.println("ascending order");
        for (int i= 0; i<y; i++)
        {
        	System.out.println(x[i]);
        }
		
		
		
        System.out.println("descending order");
       for (int i= 6; i>=0; i--)
       {
    	   System.out.println(x[i]);
       }
		
		int k []= {90,70,60,45,25,50,85,95,20,15,80,35};
		int j= k.length;
		
		Arrays.sort(k);
		
		  System.out.println("descending order");

		for (int i= 11;  i>=0; i--)
		{
			System.out.println(k[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
