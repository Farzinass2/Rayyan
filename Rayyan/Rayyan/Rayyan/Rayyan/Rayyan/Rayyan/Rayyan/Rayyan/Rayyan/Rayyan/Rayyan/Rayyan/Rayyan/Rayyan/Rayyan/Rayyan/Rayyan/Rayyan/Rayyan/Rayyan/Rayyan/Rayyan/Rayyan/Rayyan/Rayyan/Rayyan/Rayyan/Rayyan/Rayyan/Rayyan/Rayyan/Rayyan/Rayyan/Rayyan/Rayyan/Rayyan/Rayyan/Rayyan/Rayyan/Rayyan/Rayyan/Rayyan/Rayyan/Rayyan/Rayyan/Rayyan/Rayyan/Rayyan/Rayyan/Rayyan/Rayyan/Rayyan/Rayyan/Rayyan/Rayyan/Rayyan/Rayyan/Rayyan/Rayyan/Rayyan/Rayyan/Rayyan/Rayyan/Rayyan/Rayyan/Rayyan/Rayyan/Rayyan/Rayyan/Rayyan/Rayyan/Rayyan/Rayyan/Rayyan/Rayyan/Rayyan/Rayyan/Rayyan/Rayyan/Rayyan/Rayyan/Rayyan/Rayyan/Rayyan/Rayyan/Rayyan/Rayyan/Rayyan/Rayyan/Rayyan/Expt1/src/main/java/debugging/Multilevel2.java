package debugging;

public class Multilevel2  extends Mutilevel1{
	public void show2()
	{
		System.out.println("good morning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multilevel2 obj=new Multilevel2();
obj.show2();
obj.show1();
obj.show();
	}

}
