
import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//  Enter the loan and How many years
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();


		// Sections
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		// interest rates starting from 5 to 8
		//with an increment of 1/8 = 0.125
		// every month increases 0.125%
		for (double i = 5.0; i <= 8; i += 0.125) {
			System.out.println();

			System.out.printf("%5.3f", i);
			System.out.printf("%-12s","%");
			// using the InterestRate Formula
			double monthlyInterestRate = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1
				- (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
			System.out.printf("%5.2f", monthlyPayment);
			System.out.printf("%23.2f",(monthlyPayment * 12) * numberOfYears);
		}
	}
}