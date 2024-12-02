package JavaProject;

public class Comman_in_Array {

	public static void main(String[] args) {
		int a []= {1,2,3,4,5,9};
		int b []= {2,3,7,8,9};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=b.length-1;j++)
			{
				if (a[i]==(b[j]))
				{
					
					System.out.println("Same elements :" +a[i]);
				}
			}
		}

	}

}
