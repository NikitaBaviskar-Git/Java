package JavaProject;

public class Switch_Grade {

	public static void main(String[] args) {
		char ch = 'A';
		
		switch(ch)
		{
		case 'A' :
			System.out.println("You scored between 90-100");
			break;
		case 'B' :
			System.out.println("You scored between 80-90");
			break;
		case 'C' :
			System.out.println("You scored between 70-80");
			break;
		default :
			System.out.println("Invalid Grade ");
			break;
		}
	
	}

}
