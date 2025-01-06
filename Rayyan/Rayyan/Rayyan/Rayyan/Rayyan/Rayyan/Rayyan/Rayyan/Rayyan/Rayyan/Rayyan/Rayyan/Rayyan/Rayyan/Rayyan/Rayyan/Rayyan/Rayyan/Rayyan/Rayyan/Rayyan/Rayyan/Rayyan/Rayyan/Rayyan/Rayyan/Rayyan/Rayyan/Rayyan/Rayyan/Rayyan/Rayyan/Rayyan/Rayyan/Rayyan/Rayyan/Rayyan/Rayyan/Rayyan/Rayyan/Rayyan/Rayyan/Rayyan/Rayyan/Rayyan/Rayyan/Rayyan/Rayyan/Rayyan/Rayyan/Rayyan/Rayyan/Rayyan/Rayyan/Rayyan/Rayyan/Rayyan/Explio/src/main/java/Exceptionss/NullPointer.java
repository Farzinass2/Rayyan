package Exceptionss;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String a="null";
			System.out.println(a.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
	}

}
