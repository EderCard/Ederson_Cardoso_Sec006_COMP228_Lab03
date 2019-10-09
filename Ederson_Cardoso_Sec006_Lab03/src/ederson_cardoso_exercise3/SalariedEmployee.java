package ederson_cardoso_exercise3;

public class SalariedEmployee extends Employee {
	// instance data members
	private double weeklySalary;

	// Getters and Setters
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		// Validate negative value
		if (weeklySalary < 0) {
			throw new IllegalArgumentException("Weekly salary must be greater than 0");
		} else {
			this.weeklySalary = weeklySalary;
		}
	}

	/**
	 * Constructor with all parameters
	 * 
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param weeklySalary
	 */
	public SalariedEmployee(int employeeId, String firstName, String lastName, double weeklySalary) {

		super(employeeId, firstName, lastName);

		setWeeklySalary(weeklySalary);
	} // end constructor

	// This method calculate earnings based on weeklySalary
	@Override
	public double earnings() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return String.format("%s%nWeekely Salary: $%,.2f%n", super.toString(), weeklySalary);
	}

} // end class
