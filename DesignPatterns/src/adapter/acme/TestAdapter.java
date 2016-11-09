package adapter.acme;

public class TestAdapter
{
	public static void main(String[] args)
	{
		AceClass aceObject = new AceClass();
		aceObject.setName("Donal Trump");

		AceToAcmeAdapter adapter = new AceToAcmeAdapter(aceObject);
		System.out.println("First Name: " + adapter.getFirstName());
		System.out.println("Last NAme: " + adapter.getLastName());
	}
}
