package Collection;

import java.util.Scanner;

public class Input_Operation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a=sc.nextInt();		
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Two value are "+ a + b);
		System.out.println("Enter a string  : ");
		
		String str =sc.nextLine ();
		
		//System.out.println("string is  " + str);
	}

}
