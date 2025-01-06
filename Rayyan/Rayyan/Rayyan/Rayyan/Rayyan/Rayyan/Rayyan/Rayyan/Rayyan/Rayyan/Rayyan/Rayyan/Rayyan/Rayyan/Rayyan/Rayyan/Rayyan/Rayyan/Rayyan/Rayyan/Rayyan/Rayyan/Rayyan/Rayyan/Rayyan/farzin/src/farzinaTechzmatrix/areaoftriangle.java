package farzinaTechzmatrix;
import java.util.Scanner;
public class areaoftriangle {

	public static void main(String[] args) {
		double b,h,area;
		System.out.println("Enter the breadth and height");
		Scanner sc= new Scanner (System.in);
		b=sc.nextDouble();
		h=sc.nextDouble();
		area=(0.5*b*h);
		System.out.println("The area of triangle =" +area);

	}

}
