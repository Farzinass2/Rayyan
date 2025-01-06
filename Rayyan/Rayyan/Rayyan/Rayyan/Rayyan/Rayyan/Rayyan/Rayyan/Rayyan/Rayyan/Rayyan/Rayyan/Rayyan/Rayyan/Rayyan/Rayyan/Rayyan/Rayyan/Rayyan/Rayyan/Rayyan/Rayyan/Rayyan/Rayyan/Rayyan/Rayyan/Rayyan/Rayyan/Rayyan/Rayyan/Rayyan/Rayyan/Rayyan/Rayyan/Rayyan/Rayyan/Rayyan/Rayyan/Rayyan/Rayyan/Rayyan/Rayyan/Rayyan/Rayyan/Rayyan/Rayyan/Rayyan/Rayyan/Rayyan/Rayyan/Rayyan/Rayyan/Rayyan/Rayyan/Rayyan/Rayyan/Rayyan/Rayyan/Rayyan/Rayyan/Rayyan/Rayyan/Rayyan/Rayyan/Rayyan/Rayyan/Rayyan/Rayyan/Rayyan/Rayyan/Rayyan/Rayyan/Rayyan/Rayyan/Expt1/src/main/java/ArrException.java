
public class ArrException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			int a[]=new int [8];
			a[15]=23;
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}

	}

}
