package farzinaTechzmatrix;
import java.util.Scanner;
public class sum3nos {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a,b,c ,d;
		System.out.println("Enter the 3 no's");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=a+b+c;
		System.out.println("The sum is="+d);
		input.close();

	}

}
