package JavaProject;

public class Dupe_in_Array {

	public static void main(String[] args) {
		// 2. find duplicates value in array (string and Integer)
		        int[] array = {10 ,10 ,20, 30, 40, 05, 20, 30, 60, 10, 05};
		        

		        System.out.println("Duplicate elements in the array:");
		        for (int i = 0; i < array.length; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		                if (array[i] == array[j]) {
		                	
		                    System.out.println(array[i] );
		                    break;
		          
		                    
		                }
		            }
		        }
		    
		



	}

}
