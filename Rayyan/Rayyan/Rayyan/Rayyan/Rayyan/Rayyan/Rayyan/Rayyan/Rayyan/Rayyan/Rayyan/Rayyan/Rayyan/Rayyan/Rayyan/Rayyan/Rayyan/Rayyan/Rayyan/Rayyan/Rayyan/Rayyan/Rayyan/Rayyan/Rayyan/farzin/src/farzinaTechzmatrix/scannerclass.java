package farzinaTechzmatrix;
import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		


        // Creates an object of Scanner

		        Scanner input = new Scanner(System.in);



		        System.out.print("Enter your name: ");



		        // Takes input from the keyboard

		        String name = input.nextLine();



		        // Prints name

		        System.out.println("My name is " + name);



		        // Closes the scanner

		        input.close();

		    

	}

}
