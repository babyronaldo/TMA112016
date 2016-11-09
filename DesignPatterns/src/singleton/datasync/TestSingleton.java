package singleton.datasync;

public class TestSingleton
{
	public static void main(String[] args)
	{
		Database database;

		database = Database.getInstance("products");
		System.out.println("This is the " + database.getName() + " database.");

		database = Database.getInstance("employee");
		System.out.println("This is the " + database.getName() + " database.");

		// But a Database object has already been created, so the second time
		// around,
		// you should still be dealing with the same Database object, not a new
		// one.
	}
}
