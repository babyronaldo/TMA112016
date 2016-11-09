package singleton.datasync;

public class Database
{
	// Public static Database's code first checks if that object, which called
	// singleObject, exists...
	private static Database singleObject;
	private int record;
	private String name;

	// The constructor private which helps to avoid creating a new object
	// each time someone uses the new operation on your class.
	// That stops anyone’s code from using the new operator, except for the code
	// inside the Database class. But wait a minute — that’s crazy, isn’t it?
	// Who on
	// Earth would have a private constructor? How could you create objects of
	// such a class if you can’t even call the constructor?
	private Database(String name)
	{
		this.name = name;
		this.record = 0;
	}

	public static Database getInstance(String name)
	{
		if (singleObject == null)
		{
			singleObject = new Database(name);

		}
		return singleObject;
	}

	public void editRecord(String operation)
	{
		System.out.println("Performing a " + operation + " operatuin on record " + record + " in database " + name);
	}

	public String getName()
	{
		return name;
	}

}
