package farzinaTechzmatrix;
import java.util.Scanner;
public class bodmas123456 {

	public static void main(String[] args) {
		int no1,no2,sum,sub,div,mul;
		Scanner input= new Scanner(System.in);
		System.out.println("First no is");
		no1= input.nextInt();
		System.out.println("Second no is");
		no2= input.nextInt();
		
		sum=no1+no2;
		sub=no1-no2;
		div=no1/no2;
		mul=no1*no2;
		System.out.println("The sum ="+sum+"\nThe subtraction ="+sub+"\nThe division ="+div+"\nThe multiplication ="+mul);

	}

}
