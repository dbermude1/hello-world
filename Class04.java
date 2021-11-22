package lecture3;
import java.util.Scanner;
public class Class04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Integer you'd like!");
		int integer = input.nextInt();
		System.out.println("You entered " + integer);

		input.close();

		if(integer > 0) {
		System.out.println("This number is positive!");}
		
		else {
			System.out.println("This number is negative!");
		}
		
		
		
			
	}
	public static void main2(String[] args) {
		
	}
	
	
	
	
	
	
	
}
