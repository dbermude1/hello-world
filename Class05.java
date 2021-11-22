package lecture3;
import java.util.Scanner;
public class Class05 {

	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Hey give me one number!");
			int a = input.nextInt();
			System.out.println("You've entered " +a);
		
		
		
			Scanner input1 = new Scanner(System.in);
			System.out.println("Hey give me another number!");
			int b = input.nextInt();
			System.out.println("You've entered " +b);
		
		
		
			Scanner input2 = new Scanner(System.in);
			System.out.println("Hey give me another number!");
			int c= input.nextInt();
			System.out.println("You've entered " +c);
		
			input.close();
		
		int first = a;
		int second = b;
		int third = c;
		
		int d = newMethod(first, second, third);
		System.out.println("The greatest number is " +d);
		}
		
		public static int newMethod(int n1, int n2, int n3) {
			int min;
			if(n1 > n2 && n1 > n3) {
				return n1;
			}
			else if(n2 > n1 && n2> n3) {
				return n2;
			}
			else {
				return n3;
			}
		}
}
	
	


	
	

