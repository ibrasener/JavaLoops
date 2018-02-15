import java.util.Scanner;
public class FirstLoops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num= -1;
		
		while(num!=0) {
			System.out.print("Enter Number");
			num = input.nextInt();
			
			if(num >= 0) {
				System.out.println("positive");
			}
			else {
				System.out.println("Negative");

			}
		}
	System.out.println("All done!");
	
	}

}
// this terminates as lon as You dont type 0
//sentinel value
//