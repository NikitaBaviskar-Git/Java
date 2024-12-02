package Package1;

interface animal{
	void eat();
	void walk();
}
 
class herbivore implements animal{

	@Override
	public void eat() {
		System.out.println("Herbivore can eat ");		
	}

	@Override
	public void walk() {
		System.out.println("Herbivore can walk ");
		
	}
	
}
class carnivore implements animal{

	@Override
	public void eat() {
		System.out.println("Carnivore can eat ");
		
	}

	@Override
	public void walk() {
		System.out.println("Carnivore can walk ");
		
	}
}
class cow extends herbivore{
	@Override
	public void eat() {
		System.out.println("cow can eat ");		
	}

	@Override
	public void walk() {
		System.out.println("cow can walk ");
		
	}
}
class dog extends herbivore{
	@Override
	public void eat() {
		System.out.println("dog can eat ");		
	}

	@Override
	public void walk() {
		System.out.println("dog can walk ");
		
	}
}
class lion extends carnivore{
	@Override
	public void eat() {
		System.out.println("lion can walk ");
		
	}

	@Override
	public void walk() {
		System.out.println("lion can walk ");
		
	}
	
	
}
class tiger extends carnivore{
	@Override
	public void eat() {
		System.out.println("Tiger can walk ");
		
	}

	@Override
	public void walk() {
		System.out.println("Tiger can walk ");
		
	}
	
}
public class InheritanceExample {
	public static void main(String[] args) {
		 dog d = new dog();
		 d.eat();
		 d.walk();
		 tiger t = new tiger();
		 t.eat();
		 t.walk();

	}

}
