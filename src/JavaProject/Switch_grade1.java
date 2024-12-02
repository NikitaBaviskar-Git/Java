package JavaProject;

public class Switch_grade1 {

	public static void main(String[] args) {
		int marks =82;
		
		int grade=marks/10;
		
		switch(grade)
		{
		case 9 :
			System.out.println("You got A grade");
			break;
		case 8 :
			System.out.println("You got B grade");
			break;
		case 7 :
			System.out.println("You got C grade");
			break;
		case 6 :
			System.out.println("You got D grade");
			break;
		default :
			System.out.println("You are fail");
			break;
		
		}
		

	}

}
