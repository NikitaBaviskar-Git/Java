package JavaProject;

public class SortArray1 {

	public static void main(String[] args) {
		int arr[]= {2,3,5,9,10,6,7,1};
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j =0;j<arr.length-1 ;j++)
			{
				int temp=0;
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sort : ");
		for(int k =0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]+ " ");
		}
	}
}
