package Collection;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		System.out.println(h);
		
		for(int a :h)
		{
			if(a == 30)
			{
				h.remove(a);
			}
		}
		System.out.println(h);
	}

}
