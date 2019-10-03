package ederson_cardoso_exercise1;

public class CommissionEmployee extends Employee {
	// instance data members
	private double grossSales;
	private double commissionRate = 0.1; // Set default value

	// Getters and Setters
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		// Validate negative or zero value for grossSales
		if (grossSales <= 0) {
			throw new IllegalArgumentException("Gross Sales must be a positive value");
		} else {
			this.grossSales = grossSales;
		}
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		// Validate interval 0.1 to 1.0 for commissionRate
		if (commissionRate < 0.1 || commissionRate > 1.0) {
			throw new IllegalArgumentException("Commission Rate must be betwwen 0.1% and 1.0%");
		} else {
			this.commissionRate = commissionRate;
		}
	}

	/**
	 * Constructor with all parameters
	 * 
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param grossSales
	 * @param commissionRate
	 */
	public CommissionEmployee(int employeeId, String firstName, String lastName, double grossSales,
			double commissionRate) {

		super(employeeId, firstName, lastName);

		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}

	/**
	 * This method calculate earnings based on commissionRate and grossSales
	 */
	public double earnings() {
		return getCommissionRate() * getGrossSales() / 100;
	}

	@Override
	public String toString() {
		return String.format("%s%nGross Sales = %.2f%nCommission Rate = %.2f%nEarnings = %.2f%n", super.toString(),
				grossSales, commissionRate, earnings());
	}

}
