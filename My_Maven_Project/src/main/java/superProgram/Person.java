package superProgram;

public class Person {
	private String name;
	private int age;
	
	public Person(String n, int a)
	{
		this.name=n;
		this.age=a;
	}
	public void display()
	{
		System.out.println("Name is "+name+" Age is "+age);
	}

}
