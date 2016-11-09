package singleton.datasync;

//---What does Runnable interface?
//Because access to getInstance is synchronized, you can call it from multiple
//threads. TestSingletonSynchronized.java puts the synchronized
//solution to work. This code starts by calling getInstance to create a
//DatabaseSynchronized object, giving it the internal name products.

public class TestSingletonSynchronized implements Runnable
{
	Thread thread;

	public static void main(String[] args)
	{
		TestSingletonSynchronized t = new TestSingletonSynchronized();

	}

	public TestSingletonSynchronized()
	{
		DatabaseSynchronized database;
		database = DatabaseSynchronized.getInstance("products");

		thread = new Thread(this, "second");
		thread.start();

		System.out.println("This is the " + database.getName() + " database");

	}
	// The code also launches a new thread to attempt to create a new
	// DatabaseSynchronized object.

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		DatabaseSynchronized database = DatabaseSynchronized.getInstance("employee");

		System.out.println("This is the " + database.getName() + " database.");

	}

}
