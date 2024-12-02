package Collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Array_list {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Hello... ");
		a1.add("Welcome ");
		a1.add("to ");
		a1.add("Pune ");
		a1.add(2);
		a1.add(" ");
		
		System.out.println(a1);
	
		a1.set(2, "Excelr");
		System.out.println(a1);
		
		int list = a1.size();
		System.out.println(list);
		
		a1.remove(4);
		System.out.println(a1);
		
		System.out.println("*******************************");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		Collections.sort(a1);
		System.out.println(a1);//asc-desc
		
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);//reverse order dsc-asc
		
		a1.clear();
		System.out.println(a1);
	 
		
	}
}
