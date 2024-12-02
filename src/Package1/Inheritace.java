package Package1;

interface inter_1
{
	int i=50;
	void interface_method();
}

interface inter_2
{
	void interface2method();
	
}
class interface2 implements inter_1,inter_2{

	@Override
	public void interface_method() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void interface2method() {
		// TODO Auto-generated method stub
		
	}
	
}
class interface3 implements inter_1{

	@Override
	public void interface_method() {
		// TODO Auto-generated method stub
		
	}
	
}



public class Inheritace {
	static int a =10;
	final static int b =20;

	public static void main(String[] args) {
		a=20;
		System.out.println(a);
		//b=50;
		System.out.println(b);

	}

}
class class1
{
	final void m1()
	{
		System.out.print("final method");
	}
}



