package JavaProject;

public class Constructor {
	Constructor (){
		System.out.println(" Default");
	}
	Constructor (int a ){
		System.out.println("Constructor  "+a);
	}
	Constructor (int a , int b){
		System.out.println("Constructor  "+a +" "+ b );
	}
	

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor(10,20);

	}

}
