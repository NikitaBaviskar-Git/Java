package JavaProject;

public class CharacterArray {

	public static void main(String[] args) {
		String s1="Hello";
		char[] chararray=s1.toCharArray();//'h','i'
		System.out.println(chararray);
		for(char value : chararray)
		{
			System.out.println(value);
		}
	}

}
