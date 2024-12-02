package JavaProject;

public class Month_of_year {

	public static void main(String[] args) {
		String month = "Jan";
		int year = 2024;
		
		switch(month)
		{
		case "Jan" :
		case "March" :
		case "May" :
		case "July" :
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("31 Days");
			break;
			
		case "Apr":
		case "June":
		case "Sep":
		case "Nov":
			System.out.println("30 Days " );
			break;
			
		case "Feb":
			if(year%4 ==0 && year%100!=0 ||year%400==0)
			{
				System.out.println("29 Days " );
				
			}
			else
			{
				System.out.println("28 Days " );
			}
			break;
		}

	}

}
