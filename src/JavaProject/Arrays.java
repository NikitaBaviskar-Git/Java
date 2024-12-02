package JavaProject;

public class Arrays {

	public static void main(String[] args) {
		int array1[] = {10,20,30,40};//single line declaration
		//int mark []=new int[5];
		//mark[0]=20
		
		int sum=0;
		double avg;
		int len=array1.length;
		//for (int i=0;i<len-1;i++)
		//{
		//	sum=sum + array1[i];
		//}
		//avg=sum/len;
		//System.out.println(avg);
		
		for(int arr:array1) //for each loop OR Enhance for loop
		{
			sum=sum+arr;
			System.out.println(sum);
		}
		avg=sum/len;
		System.out.println(avg);
	}

}
