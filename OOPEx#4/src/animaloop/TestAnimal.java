package animaloop;

import animaloop.Animal.Sex;

public class TestAnimal
{
	public static void main(String[] args)
	{
		// Animal dog1 = new Dog(10, "Luoc", Sex.male);
		// Animal dog2 = new Dog(12, "Kem", Sex.female);
		//
		// Animal frog1 = new Frog(15, "Fat", Sex.male);
		// Animal frog2 = new Frog(20, "Little", Sex.female);
		//
		// Animal tomcat = new Tomcat(15, "Black");
		// Animal kitten = new Kitten(25, "Whilte");
		//
		// List<Animal> dogs = new ArrayList<Animal>();
		// dogs.add(dog1);
		// dogs.add(dog2);
		// List<Animal> frogs = new ArrayList<Animal>();
		//
		// frogs.add(frog1);
		// frogs.add(frog2);
		// List<Animal> cats = new ArrayList<Animal>();
		// cats.add(kitten);
		// cats.add(tomcat);
		// for (Animal animal : animals)
		// {
		// System.out.println(animal.toString());
		// }
		// Animal.AverageAge(dogs);
		// Arrays.toString(animals.toArray());
		Dog[] dogs = new Dog[] { new Dog(3, "Kem", Sex.male), new Dog(3, "Chanh", Sex.female),
				new Dog(1, "Gau", Sex.male), new Dog(9, "Luoc", Sex.male), new Dog(3, "King", Sex.male) };

		for (Dog dog : dogs)
		{
			System.out.println(dog.toString());
		}
		Dog.AverageAge(dogs);

		Cat[] cats = new Cat[] { new Cat(5, "White", Sex.male), new Cat(3, "Yellow", Sex.male),
				new Cat(3, "Red", Sex.male), new Cat(2, "Black", Sex.male), };
		Tomcat tom = new Tomcat(4, "Ghost");
		tom.toString();
		Kitten kitten = new Kitten(6, "Fish");
		kitten.toString();
		for (Cat cat : cats)
		{
			System.out.println(cat.toString());
		}
		Cat.AverageAge(cats);

		Frog[] frogs = new Frog[] { new Frog(2, "Fat", Sex.female), new Frog(3, "Tiny", Sex.male),
				new Frog(1, "Big", Sex.female), new Frog(3, "Little", Sex.female) };
		for (Frog frog : frogs)
		{
			System.out.println(frog.toString());
		}
		Frog.AverageAge(frogs);
	}
}
