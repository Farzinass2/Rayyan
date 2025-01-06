package Exceptionss;

public class Throwexception {

	
		public void check(int age)
		{
			if(age<18)
			{
				throw new ArithmeticException("person is not eligible");
				
			}
			else
			{
				System.out.println("person is  eligible");
			}
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Throwexception obj=new Throwexception();
		obj.check(23);
		

	}

}

