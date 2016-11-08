package hrmanagement;

public class Worker extends Human implements Comparable<Worker>
{
	private double weekSalary;
	private int workHoursPerDay;

	public Worker(String firstName, String lastName)
	{
		super(firstName, lastName);
	}

	public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay)
	{
		super(firstName, lastName);
		this.weekSalary = weekSalary;
		this.workHoursPerDay = workHoursPerDay;
	}

	public double getWeekSalary()
	{
		return weekSalary;
	}

	public void setWeekSalary(double weekSalary)
	{
		this.weekSalary = weekSalary;
	}

	public int getWorkHoursPerDay()
	{
		return workHoursPerDay;
	}

	public void setWorkHoursPerDay(int workHoursPerDay)
	{
		this.workHoursPerDay = workHoursPerDay;
	}

	public double MoneyPerHour()
	{
		double moneyPerHour = 0;
		// System.out.println("Money per hour: ");
		moneyPerHour = this.weekSalary / 5 / this.workHoursPerDay;
		return moneyPerHour;
	}

	@Override
	public String toString()
	{
		return "Full Name: " + firstName + " " + lastName + "\tweekSalary: " + weekSalary + "\tworkHoursPerDay: "
				+ workHoursPerDay + "\tMoneyPerHour:" + MoneyPerHour();
	}

	@Override
	public int compareTo(Worker o)
	{
		// TODO Auto-generated method stub
		return (int) (this.MoneyPerHour() - o.MoneyPerHour());
	}

}
