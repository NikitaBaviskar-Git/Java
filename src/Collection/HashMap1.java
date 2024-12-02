package Collection;

import java.util.HashMap;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		h.put("Johny",1);
		h.put("Helo",2);
		
		System.out.println(h);
		System.out.println(h.get("Helo"));
		
		for(Integer ele : h.values()) {
			System.out.println(ele);
		}
		for(String ele : h.keySet()) {
			System.out.println(ele);
			
		}
		for(Integer ele : h.values()) {
			System.out.println("key : "+ ele +" values : "+h.get(ele));
		}
		
		

	}

}
