package Package1;

public class A {
	void m1() {
		System.out.println("m1 ");
	}
	void m1(int a)
	{
		System.out.println("OverLoading Method" );
	}

	public static void main(String[] args) {
		//over loading 
		A a = new A();
		a.m1();
		a.m1(70);
		//Over Riding  
		B b = new B();
		b.m1();
		b.m1(99);
	
	}

}
