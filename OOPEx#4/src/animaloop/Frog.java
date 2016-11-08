package animaloop;

public class Frog extends Animal implements ISound
{
	// private String frogSound;

	public Frog(int age, String name, Sex sex)
	{
		super(age, name, sex);
		// this.frogSound = frogSound;
	}

	@Override
	public String Sound()
	{

		return "Oopp Oopp";

	}

	@Override
	public String toString()
	{
		return "Frog [age=" + age + ", name=" + name + ", sex=" + sex + ", Sound()=" + Sound() + "]";
	}

}
