package farzinaTechzmatrix;

public class example27 {

	public static void main(String[] args) {
	
		try
		{
		int data=100/0;	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("restof the code...");
		}

	}

}
