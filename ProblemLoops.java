import java.util.Scanner;
import java.util.Arrays;;

public class ProblemLoops {

	public static void main(String[] args) {
		double item=1; double sum=0;
		Scanner in=new Scanner(System.in);
		/*while(item!=0) {
			sum+=item;
			item-=0.1;
			//item=(int)(item*10+0.5)/10.0;
			item=Math.round(item*10)/10.0;
			System.out.println(item);
			
			String a="asdasddas";
		*/	//int result=sum12(4,3);
		    char [] chars=createArray();
			//sum12();
			printArray( new int [] {2,2,23,3});
			System.out.print((char)(Math.random()*26+'a'));
			System.out.println(createArray());
			System.out.println(chars); 
			//int [] counts= countLetters(chars);

		//}
			countLetters(chars);
		}
	public static char[] createArray() {
	 //Declare an array of characters and create it
	 char[] chars = new char[100];
	 // Create lowercase letters randomly and assign // them to the array
	 for (int i = 0; i < chars.length; i++) {
	   chars[i] = (char)(Math.random()*26+'a');
	 // Return the array
	 }return chars;
	}
	
	public static int[]countLetters(char[]chars) {
		int []counts =new int[26];
		
		for (int i=0; i<chars.length;i++) {
		counts[chars[i]-'a']++;
		}
	return counts;
		
	}
	public static void sum12() {
	Scanner in=new Scanner(System.in);
	int b= 2;
	while(0!=b) {
	System.out.print("enter number or 0 to exit ");	
	b=in.nextInt();
	System.out.println
	(b);
	}
	}
	public static void printArray(int[]array) {
		System.out.println(array[2]);
	}
	
}
	
