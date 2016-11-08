package animaloop;

public class Dog extends Animal implements ISound
{
	// private String dogSound;

	public Dog(int age, String name, Sex sex)
	{
		super(age, name, sex);
		// this.dogSound = dogSound;
	}

	@Override
	public String toString()
	{
		return "Dog [age=" + age + ", name=" + name + ", sex=" + sex + ", Sound()=" + Sound() + "]";
	}

	@Override
	public String Sound()
	{
		// TODO Auto-generated method stub
		return "Gau gau";
	}

}
