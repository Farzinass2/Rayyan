package Exceptionss;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[10];
			a[15]=12;
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}

	}

}
