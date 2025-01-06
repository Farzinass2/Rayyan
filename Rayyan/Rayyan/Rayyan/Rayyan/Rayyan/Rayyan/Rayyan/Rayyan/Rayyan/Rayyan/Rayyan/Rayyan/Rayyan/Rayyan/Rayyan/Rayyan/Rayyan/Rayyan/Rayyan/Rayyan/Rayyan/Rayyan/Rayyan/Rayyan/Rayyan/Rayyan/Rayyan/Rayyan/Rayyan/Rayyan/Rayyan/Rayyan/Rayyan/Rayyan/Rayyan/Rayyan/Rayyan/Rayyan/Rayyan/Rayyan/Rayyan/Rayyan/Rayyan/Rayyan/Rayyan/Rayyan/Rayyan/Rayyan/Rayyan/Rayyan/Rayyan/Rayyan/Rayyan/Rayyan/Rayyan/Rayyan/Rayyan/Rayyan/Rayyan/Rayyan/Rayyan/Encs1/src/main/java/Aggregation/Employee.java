package Aggregation;

public class Employee {
	String name;
	int age;
	Details d1;
	Employee(String name,int age,Details d1)
	{
		this.name=name;
		this.age=age;
		this.d1=d1;
	}
	public void check()
	{
		System.out.println(name+ " "+age);
		System.out.println(d1.city+ " "+d1.state+ " "+d1.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details obj1=new Details("bangalore","karnataka","India");
		Employee obj=new Employee("aru",12,obj1);
		obj.check();
		

	}

}
