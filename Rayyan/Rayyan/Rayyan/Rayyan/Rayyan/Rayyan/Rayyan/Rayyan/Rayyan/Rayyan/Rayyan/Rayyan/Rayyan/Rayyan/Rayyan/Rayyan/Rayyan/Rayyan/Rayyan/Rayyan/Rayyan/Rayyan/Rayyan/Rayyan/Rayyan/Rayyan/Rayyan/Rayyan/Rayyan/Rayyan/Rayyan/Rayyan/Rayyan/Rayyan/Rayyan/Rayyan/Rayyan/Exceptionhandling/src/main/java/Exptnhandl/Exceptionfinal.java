package Exptnhandl;

public class Exceptionfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[8]=12;
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally
		{
			System.out.println("excep");
		}

	}

}
