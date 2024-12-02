package JavaProject;

public class Countchar {

	public static void main(String[] args) {
		// 1.count no.of occurence every Character in String 
		        String input = "Hello my name is Nikita";
		        int[] count = new int[256]; // Array to store counts for all ASCII characters

		        // Count occurrences
		        for (char ch : input.toCharArray()) {
		            count[ch]++; // Increment the count for the character
		        }

		        // Print the occurrences
		        for (char ch = 0; ch < count.length; ch++) {
		            if (count[ch] > 0) {
		                System.out.println(ch + ": " + count[ch]);
		            }
		        }
		    
		

	}

}
