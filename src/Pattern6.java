
public class Pattern6 {

	public static void main(String[] args) {
		// Floyd's Traingle
		int n =5;
		int count =1;
		
		for(int i=1;i<=n ;i++)
		{
			for(int j=1;j<=i;i++)
			{
				System.out.print(count+ " ");
				count++;
				
			}
			
		}	System.out.println();

	}

}
