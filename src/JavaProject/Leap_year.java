package JavaProject;

public class Leap_year {

	public static void main(String[] args) {
		int year = 2017;
		if (year%4==0 && 100!=0 || year%400 ==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}

	}

}
