package Collection;

import java.util.PriorityQueue;

public class Queue1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("C ");
		pq.add(" C++ ");
		
		System.out.println(pq);
		
		for(String p : pq)
		{
			System.out.println(p);
		}
		pq.add("Apple");
		pq.add("Banana");
		System.out.println(pq);
		
	}

}
