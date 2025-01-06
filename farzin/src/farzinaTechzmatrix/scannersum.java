package farzinaTechzmatrix;

import java.util.Scanner;


public class scannersum {
	

		public static void main(String[] args) {
			int num1,num2,sum;
			Scanner input= new Scanner(System.in);
			System.out.println("Enter the First number");
			num1=input.nextInt();
			System.out.println("Enter the second number");
			num2=input.nextInt();
			sum=num1+num2;
			System.out.println("The sum=" +sum);
			input.close();
		}	

	}


