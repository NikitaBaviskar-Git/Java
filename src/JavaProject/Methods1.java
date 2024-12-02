package JavaProject;

public class Methods1 {
static int a =7;
static int b =18;
	
	public static void add() 
	{
		int sum;
		sum=a+b;
		System.out.println(sum);
	}
	public int sub()
	{
		int sub =a-b;
		System.out.println(sub);
		return sub;
		
	}
	public void mul()
	{
		int mul =a*b;
		System.out.println(mul);
	}
	
	

	public static void main(String[] args) {
		Methods1 m1 = new Methods1();
		add();
		m1.sub();
		m1.mul();
		
	}

}
