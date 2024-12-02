package JavaProject;
import java.util.*;
public class Method_overloading {

		 
		void method1()
		{
			System.out.println(" No Parameter");
		}
		void method1(int a )
		{
			System.out.println(" Parameter"+ a);
		}
		void method1(int a,int b)
		{
			System.out.println(" 2 Parameter"+ a + b);
		}
	
		public static void main(String[] args) {
			Method_overloading m1 = new Method_overloading();
			m1.method1();
			m1.method1(10);
			m1.method1(20, 30);
			StringBuilder m2 = new StringBuilder("Hi");
			m2.append("Hi");
		}

}
