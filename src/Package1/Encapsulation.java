package Package1;

class person{
	private String name ="John";
	private int age=20;
	
	public void getname()
	{
		System.out.println(name);
	}
	public void age() {
		System.out.println(age);
	}
	public void setname()
	{
		name="Niki";
		System.out.println(name);
	}
	public void setage()
	{
		age=21;
		System.out.println(name);
	}
	
}				

public class Encapsulation {

	public static void main(String[] args) {
		person p = new person();
		p.getname();
		p.age();
		p.setname();
		p.age();

	}

}
