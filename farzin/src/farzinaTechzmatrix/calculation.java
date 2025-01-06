package farzinaTechzmatrix;
import java.util.Scanner;
public class calculation {

	public static void main(String[] args) {
		
int num1,num2,sum,mul,div;
Scanner sc= new Scanner(System.in);
System.out.println("Enter 2 nos");
num1=sc.nextInt();
num2=sc.nextInt();
sc.close();
sum=num1+num2;
mul=num1*num2;
div=num1/num2;
System.out.println("The sum ="+sum+"\nThe mul ="+mul+"\nThe div is ="+div);
	}

}
