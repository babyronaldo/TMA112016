package animaloop;

public abstract class Animal implements ISound
{
	protected int age;
	protected String name;
	protected Sex sex;

	enum Sex
	{
		male, female
	}

	public Animal(int age, String name, Sex sex)
	{
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Sex getSex()
	{
		return sex;
	}

	public void setSex(Sex sex)
	{
		this.sex = sex;
	}

	public abstract String Sound();

	public static void AverageAge(Animal[] animal)
	{
		double sum = 0;
		for (Animal a : animal)
		{
			sum += a.age;
		}
		double average = sum / animal.length;
		System.out.println(average);
	}

}
