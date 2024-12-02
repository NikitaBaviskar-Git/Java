package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(" hi ");
		a.add(" hii ");
		a.add(" hiii ");
		a.add(" hiiii ");
		a.add(" hiiiii ");
		System.out.println(a);
		
		Collections.swap(a, 0, 4);
		System.out.println(a);

	}

}
