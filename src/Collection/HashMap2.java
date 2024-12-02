package Collection;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		h.put("Nikita",1);
		h.put("Riya",2);
		h.put("Priya",3);
		h.put("Siya",4);
		
		System.out.println(h);
		for(String ele : h.keySet()) 
		{
			System.out.println( ele +"  : "+h.get(ele));
		}
		

	}

}
