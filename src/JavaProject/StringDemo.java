package JavaProject;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello";
		// String str1 = new String("hi");
		System.out.println(str);
		String s1 ="hi";
		str = s1; // s1 refrence is stored in Str i.e change refrences 
		System.out.println(s1);
		System.out.println(s1.equals(str));
		System.out.println(s1.equalsIgnoreCase(str));
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		
		
		
		
	}

}
