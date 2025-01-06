package Exptnhandl;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
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

	
