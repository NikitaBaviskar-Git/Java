package JavaProject;

public class String_Buffer_Demo1 {
int s3;
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Hi");
		s1.append(" Class");//Append help in Adding word After string i.e Concat
		System.out.println(s1);
		System.out.println(s1.replace(5, 10, "Everyone"));
		System.out.println(s1.delete(5,13));
		System.out.println(s1.insert(5, "Niki"));
		//s1.setCharAt(0, 'm');
		//s2=s1.reverse();
		String s3=s1.toString();
		System.out.println(s3);
		
	}

}
