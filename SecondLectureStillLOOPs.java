
public class SecondLectureStillLOOPs {
	public static void main(String[]args) {
		System.out.println();
		System.out.println("\n\n");
		System.out.println("        1| 2| 3| 4| 5| 6| 7| 8| 9| 10| 11| 12");
		System.out.println();

		for(int i=1;i <=12;i++) {
			System.out.printf("  %1d ",i); //8 spaces // initialize space
			// times table goes here
			for(int j=1; j <=12; j++) {
				//do something
				System.out.printf("%1d ", i*j); //spaces between number
			}
			//eger olmazsa horizonal continues
			System.out.println(); //her seferinde asagi atiyor her loopta
		//	System.out.println("-----------------------------------------------");

		}
	}
}
