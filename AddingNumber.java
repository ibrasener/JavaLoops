import java.util.Scanner;
public class AddingNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt to users
		System.out.print("Please enter a first number: ");
		String number1=input.nextLine();
		System.out.print("Please enter a second number: ");
		String number2=input.nextLine();
		
		// At the end I can remove 0's thanks to these declaring
		String UserInput1=number1;

		String UserInput2=number2;
		//System.out.println(number1);
		//System.out.println(number2);
		
		// checking How many letter is higher than second number
		//if (number1.length()==number2.length()) {
			//int finalAnswer= Integer.parseInt(number1) +Integer.parseInt(number2);
			
		//}
		if (number1.length()>number2.length()) {
			//char zero='0';
			String zero="0";
			// number will contiune until they will be same length
			while (number1.length()>number2.length()) {
				number2=zero+number2;
				
			}
			
		}	
		else {
			String zero="0";
			// number will contiune until they will be same length
			while (number1.length()<number2.length()) {
				number1=zero+number1;
		}
	}
		 
		//System.out.println(number1 +number2);
		//System.out.println(number1);
		//System.out.println(number2);
	
		
		String answer="";
		int value=0;
		int adding=0;
		// Create decending digits
		//and i>=0 because digits starts at 0 
		//and i = number1.length()-1 because char location start at 0
		for(int i=number1.length()-1;i>=0;i--) {
		//	System.out.println(i);
			// checking every single digit and add them together
			 value=(int)(number1.charAt(i))-48+(int)(number2.charAt(i))-48
					 +adding;
			 // if the sum of two digits greater than 9 
			 // I need to carry and add +1 to left digits
			 	adding=0;
				if (value>9) {
						value-=10;
						adding+=1;
				}
				answer=value+answer;
		}
		
		// removing 0's I use declare UserInput1=number1
		//UserInput2=number2  so I can use the UserInput for simply
	    System.out.println("the answer is " + answer);
		System.out.printf("Addition: %35s\n",UserInput1);

		System.out.printf("         +%35s\n",UserInput2);	

		System.out.printf("         =%35s\n",answer);	
		
		//System.out.printf("=%6d\n",finalAnswer.substring(0,1));	

		
		}
				
	}


