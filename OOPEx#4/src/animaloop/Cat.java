package animaloop;

public class Cat extends Animal implements ISound
{
	// private String catSound;

	public Cat(int age, String name, Sex sex)
	{
		super(age, name, sex);
		// this.catSound = catSound;
	}

	@Override
	public String Sound()
	{

		return "Moeoo moeoo";

	}

	@Override
	public String toString()
	{
		return "Cat [age=" + age + ", name=" + name + ", sex=" + sex + ", Sound()=" + Sound() + "]";
	}

}
