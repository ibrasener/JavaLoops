import java.util.Scanner;
public class hexNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		// display 5.5
		System.out.print("Enter a hex number: ");
		char hex= in.next().toUpperCase().trim().charAt(0);
		
		System.out.print("The hex letter "+ hex+ " is ");
		switch (hex) {
		case '0':System.out.print(1);	break;
		case '1':System.out.print(2);	break;
		case '2':	System.out.print(10);break;
		case '3':System.out.print(10);	break;
		case '4':	System.out.print(10);break;
		case '5':System.out.print(10);break;
		case '6':System.out.print(10);	break;
		case '7':System.out.print(10);	break;
		case '8':System.out.print(10);	break;
		case '9':System.out.print(10);	break;
		case 'A':	
			System.out.print(10);
			break;
		case 'B':
			System.out.print(11);
			break;
		case 'C':
			System.out.print(12);
			break;
		case 'D':
			System.out.print(13);
			break;
		case 'F':
			System.out.print(14);
			break;
		case 'E':
			System.out.print(15);
			break;	
				
		}
		System.out.println(" in base 10.");
		
		String te= "dsa";
		char majors= te.charAt(2);
		
		System.out.println(majors);
		String hexLong=in.next();
		
		System.out.println(hexLong+" is "+ Integer.parseInt(hexLong,16)+" in base 10 ");

		
		}
	

	
}
