package JavaProject;

public class Grade {

	public static void main(String[] args) {
		int Marks = 85;
		
		if (Marks < 100 && Marks >= 90)
		{
			System.out.println("Marks Grade A");
		}
		else if (Marks < 90 && Marks >= 80)
		{
			System.out.println("Marks Grade B");	
		}
		else if (Marks < 80 && Marks >= 70)
		{
			System.out.println("Marks Grade C");	
		}
		else 
		{
			System.out.println("Marks Grade D");	
		}

	}

}
