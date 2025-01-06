package farzinaTechzmatrix;
import java.util.Scanner;
public class areacircumferenceofcircle {

	public static void main(String[] args) {
		double r,pi,area,cir;
		System.out.println("Enter the radius and circumference");
		Scanner sc= new Scanner(System.in);
		r=sc.nextDouble();
		area=Math.PI*r*r;
		cir=Math.PI*2*r;
		System.out.println("The area  of circle="+area+"\n The circumference of circle =" +cir);

	}

}
