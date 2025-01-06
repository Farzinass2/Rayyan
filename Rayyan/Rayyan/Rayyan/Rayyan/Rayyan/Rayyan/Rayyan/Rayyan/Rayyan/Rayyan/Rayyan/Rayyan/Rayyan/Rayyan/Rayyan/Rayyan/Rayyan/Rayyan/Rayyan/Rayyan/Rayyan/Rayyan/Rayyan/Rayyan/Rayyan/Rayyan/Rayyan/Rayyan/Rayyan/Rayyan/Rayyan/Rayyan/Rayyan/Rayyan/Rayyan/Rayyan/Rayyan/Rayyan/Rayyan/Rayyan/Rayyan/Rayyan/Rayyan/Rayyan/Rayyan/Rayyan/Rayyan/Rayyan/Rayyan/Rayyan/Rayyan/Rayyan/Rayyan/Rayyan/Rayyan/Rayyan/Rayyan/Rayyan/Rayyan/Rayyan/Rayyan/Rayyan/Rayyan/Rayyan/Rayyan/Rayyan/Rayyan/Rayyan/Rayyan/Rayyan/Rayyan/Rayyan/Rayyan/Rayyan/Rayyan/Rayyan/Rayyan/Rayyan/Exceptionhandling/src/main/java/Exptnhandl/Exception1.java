package Exptnhandl;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10/5;
			
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


