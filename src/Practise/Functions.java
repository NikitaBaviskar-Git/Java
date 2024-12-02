package Practise;

import java.util.Scanner;

public class Functions {
	
	public static void PrintMyName(int a , int b)
	{
		int sum=a+b;
		System.out.println("Addition is  : "+ sum);
		return;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a=sc.nextInt();
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		PrintMyName(a,b);
		
	}

}
