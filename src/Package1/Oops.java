package Package1;

public class Oops {

	public static void main(String[] args) {
		// Inheritance
		Y b1=new Y();
		//b1.child();
		Z z = new Z();
		z.child();
		z.parent();
	}
}

//Parent -->Single level Inheritance
 class X{
	void parent()
	{
		System.out.print("Parent class");
	}
}
//child
class Y extends X{
	void child()
	{
		System.out.print("child class");
	}
}
//multi level Inheritance
class Z extends Y{
}

class i{}
class j{}
//class k extends i,j{}//multiple 
class k extends i{}
class m extends k{} //Hybrid 