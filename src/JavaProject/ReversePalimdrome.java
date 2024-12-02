package JavaProject;

public class ReversePalimdrome {

	public static void main(String[] args) {
		String s1 ="Java is a Program ";
		String rev = "" ;
		
		for(int i =s1.length()-1 ; i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equalsIgnoreCase(rev)) 
		{
			System.out.println("Yes Palimdrome");
			
		}
		else {
			System.out.println("Not a Palimdrome");
		}

	}

}
