package JavaProject;

public class Array4 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Before Reverse : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("After Reverse : ");
		for(int j =arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j] + " ");
		}

	}

}
