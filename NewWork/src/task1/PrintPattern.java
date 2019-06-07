package task1;

public class PrintPattern 
{

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
	/*
	 * for whole star printing
	 * 
	 * 	int n=4;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}*/

		/*for traingle
		 * 
		 * int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/

	/*	int n=4;
		 for (int i=1; i<=n; i++) 
	        { 
	            // Print space in decreasing order 
	            for (int j=n; j>i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in increasing order
	            for (int k=1; k<=i; k++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }*/
	
		//number patterns
	/*	int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}*/
		
		/*int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}*/
		
		
		/*int n=5,k=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println("");
		}*/
		
		//number right traingle
		
		/*int n=4;
		int m=1;
		 for (int i=1; i<=n; i++) 
	        { 
	            // Print space in decreasing order 
	            for (int j=n; j>i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in increasing order
	            for (int k=1; k<=i; k++)
	            {
	                System.out.print(m);
	                m++;
	                
	            }
	            System.out.println();
	        }*/
		
	
		//reverse of above program
		
		/*int n=4;
		int m=1;
		 for (int i=1; i<=n; i++) 
	        { 
	            // Print space in decreasing order 
	            for (int j=n; j>=i; j--)
	            {
	                System.out.print(" ");
	                
	            }
	            // Print star in increasing order
	            for (int k=1; k<=i; k++)
	            {
	            	
	                System.out.print(m);
	               m++;
	                
	            }
	            System.out.println();
	        }*/
		
		//whole traingle number from 1 to 10
		int n=4;
		int m=1;
		 for (int i=1; i<=n;i++) 
	        { 
	            // Print space in decreasing order 
	            for (int j=n-i; j>1; j--)
	            {
	                System.out.print(" ");
	                
	            }
	            
	            for (int j=1; j<=i; j++)
	            {
	            	
	                System.out.print(m+" ");
	               m++;
	                
	            }
	            System.out.println();
	        }
		
        } 
	}

