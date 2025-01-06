package farzinaTechzmatrix;
import java.util.Scanner;
public class sumof2nos {

	public static void main(String[] args) {
		int num1, num2,num3, pdt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        num1 = sc.nextInt();
        
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        sc.close();
        pdt = num1 *num2*num3;
        System.out.println("Sum of these numbers: "+pdt);

	}

}
