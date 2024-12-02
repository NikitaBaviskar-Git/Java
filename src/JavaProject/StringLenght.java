package JavaProject;

public class StringLenght {
char c;
	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("Hello  Everyone");
		int count=0;
		for (int i =0;i < s1.length();i++)
		{
			if(s1.charAt(i)== 'e') 
			{
			count++;
			}
		}
		System.out.println(count);
		
		
	}
	
	}


