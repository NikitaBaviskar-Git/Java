package JavaProject;
import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		int a []= {4,7,2,1,3,8,6,10,9};
		System.out.print("Before Sorting : ");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("After Sorting : ");
		for (int j=0;j<=a.length-1;j++)
		{
			System.out.print(a[j]+ " ");
		}

	}

}
