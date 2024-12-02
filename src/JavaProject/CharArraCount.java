package JavaProject;

public class CharArraCount {

	public static void main(String[] args) {
		String s1="Java Programming Language ";
		int count=0;
		char[] chararray=s1.toCharArray();//'h','e','l','l','o'
		System.out.println(chararray);
		
		for(int i=0;i<chararray.length;i++)
		{
			if(chararray[i]== 'a')
			{
				count ++;
			}
		}
		System.out.println("count of a : "+count);
		

	}

}
