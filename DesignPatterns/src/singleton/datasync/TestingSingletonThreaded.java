package singleton.datasync;

public class TestingSingletonThreaded implements Runnable
{
	// Thread thread and implements Runnable
	Thread thread;

	public static void main(String[] args)
	{
		TestingSingletonThreaded t = new TestingSingletonThreaded();
	}

	public TestingSingletonThreaded()
	{
		DatabaseThreaded database;
		database = DatabaseThreaded.getInstance("products");
		// Create Thread thread
		thread = new Thread(this, "second");
		thread.start();

		System.out.println("This is the " + database.getName() + " database.");
	}

	@Override
	public void run()
	{
		DatabaseThreaded database;
		database = DatabaseThreaded.getInstance("employees");
		System.out.println("This is the " + database.getName() + " database.");
	}

}
