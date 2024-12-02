package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Practise 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("Banana");
		a.add("Kiwi");
		a.add("Cheery");
		a.add("Guava");
		
		System.out.println(a);
		
		for( String iteration : a)
		{
			System.out.println(iteration);
		}
		
		a.set(3, "Mango");
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
				

	}

}
