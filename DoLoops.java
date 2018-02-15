import java.util.Scanner;

public class DoLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner input = new Scanner(System.in);
			
			int num= -1;
			do{	
				System.out.print("Enter Number");
				num = input.nextInt();
				
				if(num >= 0) {
					System.out.println("positive");
				}
				else {
					System.out.println("Negative");
				
				}
			
			
		System.out.println("All done!");
		
		} while(num!=0); 
			
		
		}
	}
		
	// this terminates as lon as You dont type 0
	//sentinel value
	//