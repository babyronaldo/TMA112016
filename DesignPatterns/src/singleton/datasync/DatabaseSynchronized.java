package singleton.datasync;

public class DatabaseSynchronized
{
	private static DatabaseSynchronized singleObject;
	private int record;
	private String name;

	private DatabaseSynchronized(String name)
	{
		this.name = name;
		record = 0;
	}

	// Using the synchronized keyword blocks access to the getInstance method
	// by any new thread once a thread is executing code inside the method; any
	// new
	// threads attempting to get in have to wait until the current thread is
	// finished.
	// Using synchronized is one easy way to enforce single-threaded execution,
	// and in this case, it solves the problem.
	public static synchronized DatabaseSynchronized getInstance(String name)
	{
		if (singleObject == null)
		{
			singleObject = new DatabaseSynchronized(name);
		}
		return singleObject;
	}

	public void editRecord(String operation)
	{
		System.out.println("Performing a " + operation + " operation on record " + record + " in database " + name);
	}

	public String getName()
	{
		return name;
	}
}
