package csci;
import java.util.Scanner;
public class Inputvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
// The line of code is going to take the integer the user says//
System.out.print("Choose an integer: ");
int number = input.nextInt();
//The TWO lines of code above ask the user to input, and then turns 
//the text into an integer number
System.out.println("Your number is " + number);

// this is to close the scanner and use the number in Arithmic 


//This is the part of the code to start adding the input by one

System.out.println(number++);

System.out.println("Your number added by one is " +number);

System.out.println(number--);
System.out.println(number--);

System.out.println("Your number subtracted by one is " +number);
	}

}
