
public class LoopsExample {

	public static void main(String[] args) {

		// 1. Do while loop
		int i = 1;
		do {
			System.out.println(i);
			i++;
			// using break
			 if (i==5) break;
		} while (i <= 10);
		
		
		

		// 2. Using While loop
		System.out.println(" Using While loop :");
		i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		
		// 3. For loop
		System.out.println(" Using simple for loop :");
		for (i = 5; i <= 10; i++) {
			System.out.println(i);

		}

		// 4. Nested for loops
		for (i = 1; i <= 3; i++) {
			// inner loop
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}

		// use of continue
		for (i = 1; i <= 10; i++) {
			// print only even numbers
			if (i % 2 != 0)
				continue;
			System.out.println(i);
			if (i == 8)
				break;

		}


		// 5. Enhanced for loop

		String[] languages = { "Java", "Ruby", "C++", "Python" };
		// for loop to read the array
		for (i = 0; i < languages.length; i++) {
			System.out.println(languages[i]);
		}

		// for each loop
		for (String myvar : languages) {
			System.out.println(myvar);
		}

	}

		
}
