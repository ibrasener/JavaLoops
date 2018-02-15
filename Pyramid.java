import java.util.Scanner;
public class Pyramid {

    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        // the user to enter an integer from 1 to 15
        System.out.print("Enter the number of lines: (1-15) ");
        int numberOfLines = input.nextInt();
   if(numberOfLines>=1&&numberOfLines<=15) {
        for (int currentRow = 1; currentRow <= numberOfLines; currentRow++) {
        		// Spaces in row
            for (int currentColumn = 1; currentColumn <= numberOfLines - currentRow; currentColumn++) {
                System.out.printf("%3s", " ");
            }
			// Decreasing numbers in row 
            for (int number = currentRow; number >= 1; number--) {
                System.out.printf("%3d", number);
            }
			// Rising number in row
            for (int number = 2; number <= currentRow; number++) {
                System.out.printf("%3d", number);
                

            }
            System.out.println();
		}
        }
    else {
    	System.out.println("Invalid number.");
    }
    }
	}