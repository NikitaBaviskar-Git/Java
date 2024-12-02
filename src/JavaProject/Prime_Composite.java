package JavaProject;

public class Prime_Composite {

	public static void main(String[] args) {
		int num =9;
		
		for(int i = 1 ;i<= num/2;i++)
		{
			if(num%i==0)
			{
				System.out.print("Prime");
			}
			else
			{
				System.out.print("not Prime");
			}
		}
		

	}

}
