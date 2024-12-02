package Package1;

abstract class shape{
	
	void draw() {
		System.out.println("Draw method");
	}
	abstract void area();
	
}
class rectangle extends shape{

	@Override
	void area() {
		System.out.println("Area method from rectangle");
		
	}
	
}

public class abstraction {

	public static void main(String[] args) {
		rectangle r = new rectangle();
		r.draw();
		r.area();

	}

}
