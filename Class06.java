package lecture3;
import java.util.Scanner;
public class Class06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 7");
		int day = input.nextInt();
		
		
		 input.close();
		 if(day > 0 && day<8) {
		 System.out.println("This is the day you choosed, " +dayWeek(day));
		 }
		 else {
			 System.out.println("Invalid Number");
		 }
	}
	public static String dayWeek(int day) {
		String nameDay ="" ;
		switch(day) {
		case 1: nameDay = "Monday"; break;
		case 2: nameDay = "Tuesday"; break;
		case 3: nameDay = "Wednesday"; break;
		case 4: nameDay = "Thursday"; break;
		case 5: nameDay = "Friday"; break;
		case 6: nameDay = "Saturday"; break;
		case 7: nameDay = "Sunday"; break;
		
		}
		return nameDay;
	}
}
