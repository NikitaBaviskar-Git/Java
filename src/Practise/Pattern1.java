package Practise;

public class Pattern1 {

	public static void main(String[] args) {
		//Butterfly
		int n = 5;
		//upper half
		for(int i=1;i<=n;i++);
		{
			int i=n;
			for (int j=1;j<=i;j++)
			{	
			System.out.print(" * ");
			}
		
		//space
		int space = 2*(n-i);
		for(int j =1 ;j<=space ;j++)
		{
			System.out.print(" ");
		}
		//2nd space
		for(int j=1 ;j<=i ;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
		
		}
		//Lower
		for(int k=n;k>=1;k--);
		{
			int k=n;
			for (int j=1;j<=k;j++)
			{	
			System.out.print(" * ");
			}
		
		//space
			int i = n;
		int space = 2*(n-i);
		for(int j =1 ;j<=space ;j++)
		{
			System.out.print(" ");
		}
		//2nd space
		for(int j=1 ;j<=i ;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
		
		}

	}

}
