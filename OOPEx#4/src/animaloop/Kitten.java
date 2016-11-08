package animaloop;

public class Kitten extends Cat implements ISound
{
	// private String sound;

	public Kitten(int age, String name)
	{
		super(age, name, Sex.female);
		// this.sex = Sex.female;

	}

	@Override
	public String toString()
	{
		return "Kitten [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}
