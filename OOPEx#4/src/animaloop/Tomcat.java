package animaloop;

public class Tomcat extends Cat implements ISound
{
	// private String sound;

	public Tomcat(int age, String name)
	{
		super(age, name, Sex.male);
		// this.sex = Sex.male;
	}

	@Override
	public String toString()
	{
		return "Tomcat [age=" + age + ", name=" + name + ", sex=" + sex;
	}
}
