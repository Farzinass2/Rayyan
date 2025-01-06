package farzinaTechzmatrix;
import java.util.Scanner;
public class Scannerinteger123 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer no");
		int data= input.nextInt();
		System.out.println("Using nextInt();" +data);
		input.close();
	}

}
