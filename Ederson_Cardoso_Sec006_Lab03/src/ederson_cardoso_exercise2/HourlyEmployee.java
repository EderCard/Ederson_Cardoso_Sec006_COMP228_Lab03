package ederson_cardoso_exercise2;

public class HourlyEmployee extends Employee {
	// instance data members
	private double hoursPerWeek;
	private double hourRate = 14; // Set default value

	// Getters and Setters
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		// Validate negative value
		if (hoursPerWeek < 0) {
			throw new IllegalArgumentException("Hours per week cannot be negative");
		} else {
			this.hoursPerWeek = hoursPerWeek;
		}
		// add extra validations to be a more realistic example
		// max 72h per week by law
		// 40h to 60h = 1.5x
		// 60h to 72h = 2x
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		// Validate minimum value (14)
		if (hourRate < 14) {
			throw new IllegalArgumentException("Hour rate must be at least $14.00 per hour");
		} else {
			this.hourRate = hourRate;
		}
	}

	/**
	 * Constructor with all parameters
	 * 
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param hoursPerWeek
	 * @param hourRate
	 */
	public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursPerWeek, double hourRate) {

		super(employeeId, firstName, lastName);

		setHoursPerWeek(hoursPerWeek);

		setHourRate(hourRate);
	} // end constructor

	// This method calculate earnings based on hoursPerWeek and hourRate
	@Override
	public double getPaymentAmount() {
		return getHoursPerWeek() * getHourRate();
	}

	@Override
	public String toString() {
		return String.format("%s%nHours per week: %.2f%nHour Rate: $%.2f%n", super.toString(),
				getHoursPerWeek(), getHourRate());
	}
	
} // end class
