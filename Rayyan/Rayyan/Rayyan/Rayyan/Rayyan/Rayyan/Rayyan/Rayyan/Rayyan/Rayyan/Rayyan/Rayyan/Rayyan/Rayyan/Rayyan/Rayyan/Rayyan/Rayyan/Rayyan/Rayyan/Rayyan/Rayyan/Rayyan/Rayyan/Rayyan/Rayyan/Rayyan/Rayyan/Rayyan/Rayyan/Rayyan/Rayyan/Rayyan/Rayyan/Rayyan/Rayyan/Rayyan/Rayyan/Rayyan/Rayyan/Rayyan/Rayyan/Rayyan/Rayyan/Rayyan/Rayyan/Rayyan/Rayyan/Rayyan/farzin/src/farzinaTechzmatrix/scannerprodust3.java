package farzinaTechzmatrix;
import java.util.Scanner;
public class scannerprodust3 {

	public static void main(String[] args) {
		int n1,n2,n3,pdt;
		Scanner input= new Scanner(System.in);
		System.out.println("The first no is ");
		n1=input.nextInt();
		System.out.println("The second no is ");
		n2=input.nextInt();
		System.out.println("The third no is ");
		n3=input.nextInt();
		pdt=n1*n2*n3;
		System.out.println("The product no is =" +pdt);
		
		input.close();

	}

}
