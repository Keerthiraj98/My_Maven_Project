package superProgram;

public class Student extends Person {
	
	private String course;
	
	public Student(String n, int a, String c)
	{
		super(n, a);
		this.course=c;
		
	}
	public void show()
	{
		display();
		System.out.println("Course is "+course);
	}

}
