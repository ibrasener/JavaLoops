
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		/*display    
		 *   1
	       2 1 2
	     3 2 1 2 3
	   4 3 2 1 2 3 4
	 5 4 3 2 1 2 3 4 5*/
		
		for (int i=1; i<=5;i++) {
			for (int j=1; j<=5-i;j++) { // j<=5-i means spaces doenst affect the number
				System.out.printf("  ");}
				for(int LeftNumber=i;LeftNumber>=1;LeftNumber--) {
					System.out.print(" "+LeftNumber);// I add the number 
					// if the i = 3 it means 5 times add each other 2n-1
				}
					for (int RightNumber=2;RightNumber<=i;RightNumber++) {
						System.out.print(" "+RightNumber);// I add the number 
					// 
					}
				
				System.out.println();
			}
		/*display    
		 *     1
	         2 1 2
	       3 2 1 2 3
	     4 3 2 1 2 3 4
	   5 4 3 2 1 2 3 4 5
		 4 3 2 1 2 3 4 
		   3 2 1 2 3
		     2 1 2
		       1
		       */
		for (int i=1; i<=5;i++) {
			for (int j=1; j<=5-i;j++) { // j<=5-i means spaces doenst affect the number
				System.out.printf("  ");}
				for(int LeftNumber=i;LeftNumber>=1;LeftNumber--) {
					System.out.print(" "+LeftNumber);// I add the number 
					// if the i = 3 it means 5 times add each other 2n-1
				}
					for (int RightNumber=2;RightNumber<=i;RightNumber++) {
						System.out.print(" "+RightNumber);// I add the number 
					// 
					}
				
				System.out.println();
			}
		for (int i=5-1; i>=1;i--) {
			for (int j=1; j<=5-i;j++) { // j<=5-i means spaces doenst affect the number
				System.out.printf("  ");}
				for(int LeftNumber=i;LeftNumber>=1;LeftNumber--) {
					System.out.print(" "+LeftNumber);// I add the number 
					// if the i = 3 it means 5 times add each other 2n-1
				}
					for (int RightNumber=2;RightNumber<=i;RightNumber++) {
						System.out.print(" "+RightNumber);// I add the number 
					// 
					}
				
				System.out.println();
			}
		/* display
		* * * *
		* * * *
		* * * *
		* * * *
		*/
		System.out.print("Enter the lines: ");
		int lines= input.nextInt();
		for (int i= 1 ; i<=lines ; i++) {
			for(int j=1;j<=lines;j++) {
				System.out.printf("%1s","*"); //same like below
				//System.out.printf("*");   %2s koyulabilir
			}
				System.out.println();
		}
		/* display
		* 
		**
		*** 
		****
		
		*/
		
		for (int i=1;i<=lines;i++) { //lines
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		/* display
		* * * *
		* * * 
		* * 
		* 
		
		*/
		
		for (int i=lines;i>=1;i--) { //lines
			for(int j=1;j<=i;j++) {
				System.out.printf("%2s","*");
			}
			System.out.println();
			}
		/* display
		* * * *
		*     *
		*     *
		* * * *
		*/
		for (int i=1;i<=4;i++) {//lines
			for(int j=1;j<=4;j++) {
				if(i==1||i==4||j==1||j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.println();
		}
		/* display
		1
	   1 1
	  1 2 1
	 1 3 3 1
	1 4 6 4 1 
		*/
		
		for(int i=0; i<=lines;i++ ) {
			for(int j=1;j<=lines-i;j++) {
				System.out.print(" ");
			}
				int triangleFormula=1;
				for(int j=0;j<=i;j++) {
					System.out.print("  "+triangleFormula);
					triangleFormula=triangleFormula*(i-j)/(j+1);
					
				}
				System.out.println();

			}
		
		for (int i =1 ; i<=5 ; i++) {
			for(int k=1; k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int t=i; t< Math.pow(i, 2); t+=2) {
				System.out.print(" "+t);

			}
			for (int y=(int) Math.pow(i, 2); y>=1; Math.sqrt(y)) {
				System.out.print(" "+y);
			}
			System.out.println();

		}
	}
}	



