import java.util.Scanner;
public class AddingNumber2Practice {

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
	
		if (number1.length()<number2.length()) {
			int i = number1.length();
			String zero="0";
			while(i<number2.length()) {
				number1=zero+number1;
				i++;
			}
			System.out.print(number1);
		}
		else {
			String zero="0";
			while(number1.length()>number2.length()) {
				number2=zero+number2;
			}	
		}
		String answer="";
		int result=0;
		int carry=0;
		for(int i = 0; i<number1.length();i++ ) {
			carry=0;
			if(result>9) {
				result=result-10;
				carry+=1;
			}
			result=(int)(number1.charAt(i))-48+(int)(number2.charAt(i))-48
					+carry;
		
			answer=answer+result;
		}
		System.out.print(answer);
	}
		

}
