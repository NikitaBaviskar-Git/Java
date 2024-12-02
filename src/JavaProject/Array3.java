package JavaProject;

public class Array3 {

	public static void main(String[] args) {
		int a[] = {3,10,20,30,40,50,79 };
		int max = a[0] ;
		int min = a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if (a[i] <min )
			{
				min=a[i];
			}
		}
		System.out.println("max : "+ max);
		System.out.println("min : " +min);
	}

}
