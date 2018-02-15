
public class MakeCombinationWhile {

	public static void main(String[] args) {
		
		int firstNumber=1;
		int count=0;
		while (firstNumber<=7) {
			int secondNumber=firstNumber+1;
			while(secondNumber<=7) {
				System.out.print(firstNumber+" "+secondNumber+"\n");
				secondNumber++;
				count++;
			}
			firstNumber+=1;
		}
		System.out.println("Total combination: "+ count);

	}

}/*
counter = 0;
for (int i = 1; i < 8; i++){
    for (int j = i + 1; j < 8; j++) {
        System.out.println(i + " " + j);
        counter++;
*/