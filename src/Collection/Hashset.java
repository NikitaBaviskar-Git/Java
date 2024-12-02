package Collection;

import java.util.HashSet;

public class Hashset 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(4);
		System.out.println(h);
		
		h.remove(4);
		System.out.println(h);
		
		for(int ele : h)
		{
			System.out.println(ele);
		}
	}

}
