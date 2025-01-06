package farzinaTechzmatrix;
import java.util.Scanner;
public class avgtot0009 {

	public static void main(String[] args) {
		int a,b,tot,avg;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the 2 nos");
		a=input.nextInt();
		b=input.nextInt();
		tot=a+b;
		avg=(a+b)/2;
		System.out.println("The total =" +tot+"\nThe avg ="+avg);
		input.close();

	}

}
