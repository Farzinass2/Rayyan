package Aggregation;

public class Employee1 {
	String city;
	String state;
	Details d2;


Employee1(String city,String state,Details d2)
{
	this.city=city;
	this.state=state;
	this.d2=d2;

}
public void display() {
	System.out.println(city+ " "+state);
	System.out.println(d2.city+ " "+d2.state+" "+d2.country);
}

public static void main (String args[])
{
	Details obj1=new Details("aluva","kerala","India");
	Employee1 obj=new Employee1("banglore","karnataka",obj1);
	obj.display();
}
}