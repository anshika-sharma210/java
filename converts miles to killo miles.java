package mileskm;
import java.util.Scanner;


public class Exercise2 {
// java example - converts miles to killo miles to km and km to miles
		
		    
			public static void main(String[] args) {
				// Create a constant number of kilometers in a mile
				final double KILOMETERS_PER_MILE = 1.609; 

				// Display table header
				System.out.println(
					"Miles        Kilometers");

				// Create and display table showing conversion from miles to kilometers
				for (int i = 1; i <= 10; i++) {
					System.out.printf(
						"%-13d%-10.3f\n", i, (i * KILOMETERS_PER_MILE));
				}
			}
}

	
