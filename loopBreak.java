
public class loopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			    int sum = 0;
			    int number = 0;

			    while (number < 20) {
			      
			     if(number ==10|| number==11) {
			    	 	continue;
			      }
			     number++;
			      sum += number;
			     // if (sum >= 100) 
			      //  break;
			    

			    System.out.println("The number is " + number);
			    System.out.println("The sum is " + sum);
	
	}

}
}
