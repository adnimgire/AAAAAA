package array_pack;

public class Array_class {
	
	public static void main(String[] args)
	{
		// 1
		 
		int a []= {1,2,3,4,5};
		      //   0,1,2,3,4   INDEX
		System.out.println(a[3]);
		
		System.out.println(a[0]);
		
		// 2
		
		char [] z= {'a','b','c','d'};  
		         //  0,  1,  2,  3      INDEX
		
		System.out.println(z[0]);
		
		System.out.println(z[3]);
		
		// 3
		
		int n[]= new int [5];
		n[0]= 10;
		n[1]= 20;
		n[2]= 30;
		n[3]= 40;
		n[4]= 50;
		
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		
		//4
		
		int m[]= {1,2,3,4,5,6,7,8,9};
		  int y= m.length;
		
		  for (int i=0; i<y; i++)
		  {
			  System.out.println(m[i]);
		  }
		
		
		
		
		
	}

}
