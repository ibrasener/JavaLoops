
public class MathCombinationDO {

	public static void main(String[] args) {

		int firstNumber=1;
		int count=0;
		do {
			int secondNumber=firstNumber+1;
			do {
				System.out.println(firstNumber+" "+secondNumber);
				secondNumber++;
				count++;
			}while(secondNumber<=7); 
			firstNumber++;
		
		}while(firstNumber<=7-1);
		System.out.println("Total combination: "+ count);

	}

}
