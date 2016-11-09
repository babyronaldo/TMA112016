package adapter.acme;

public class AceToAcmeAdapter
{
	AceClass aceObject;
	String firstName;
	String lastName;

	// Constructor
	public AceToAcmeAdapter(AceClass aceObject)
	{
		this.aceObject = aceObject;
		firstName = aceObject.getName().split(" ")[0];
		lastName = aceObject.getName().split(" ")[1];
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

}
