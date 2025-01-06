package Exceptionss;

public class Numberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String a="hello";
			int b=Integer.parseInt(a);
					
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}

	}

}
