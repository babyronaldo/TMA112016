package hrmanagement;

public class Student extends Human implements Comparable<Student>
{
	private int grade;

	public Student(String firstName, String lastName)
	{
		super(firstName, lastName);
	}

	public Student(String firstName, String lastName, int grade)
	{
		super(firstName, lastName);
		this.grade = grade;
	}

	public int getGrade()
	{
		return grade;
	}

	public void setGrade(int grade)
	{
		this.grade = grade;
	}

	@Override
	public String toString()
	{
		return "Full Name: " + firstName + " " + lastName + "\tgrade=" + grade;
	}

	@Override
	public int compareTo(Student o)
	{
		// TODO Auto-generated method stub
		return this.getGrade() - o.getGrade();
	}

}
