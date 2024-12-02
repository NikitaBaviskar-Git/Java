package Collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(2);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
		
		
		a.contains(a1) ;
		System.out.println(a.containsAll(a1));
		//System.out.println(a.equals(a1));
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		for(int elements : a)
		{
			//a3.add(a1.contains(elements) ? "Yes":"No");
			
		}
		System.out.println(a3);
	}

}
