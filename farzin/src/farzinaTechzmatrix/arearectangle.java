package farzinaTechzmatrix;
import java.util.Scanner;
public class arearectangle {

	public static void main(String[] args) {
		int l,b,area;
		System.out.println("Enter the length and breadth");
		Scanner input = new Scanner(System.in);
		l=input.nextInt();
		b=input.nextInt();
		area=l*b;
		System.out.println("The area =" +area);

	}

}
