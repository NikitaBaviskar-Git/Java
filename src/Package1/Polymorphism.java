package Package1;


class women {
	void cook()
	{
		System.out.println("Women can cook");
	}
	void fight()
	{
		System.out.println("Women can fight");
	}
}

class teacher extends women{
	void teach()
	{
		System.out.println("Women can teach");
	}
	void teach(String sub)
	{
		System.out.println("Women can teach2");
	}
	
}
public class Polymorphism {

public static void main(String[] args) {
		teacher t = new teacher();
		t.cook();
		t.fight();
		t.teach();
		t.teach("Hii");

	}

}
