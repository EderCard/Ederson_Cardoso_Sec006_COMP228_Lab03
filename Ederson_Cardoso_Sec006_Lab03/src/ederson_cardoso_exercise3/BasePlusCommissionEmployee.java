package ederson_cardoso_exercise3;

public class BasePlusCommissionEmployee extends CommissionEmployee // inheritance
{
	private double baseSalary = 200.00; // Set default value

	// Getters and Setters
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary > 200.00) {
			this.baseSalary = baseSalary;
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
	 * @param baseSalary
	 */
	public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName, double grossSales,
			double commissionRate, double baseSalary) {

		super(employeeId, firstName, lastName, grossSales, commissionRate); // call constructor from super class

		setBaseSalary(baseSalary);
	} // constructor end

	// This method calculate earnings
	@Override
	public double earnings() {
		// return (getCommissionRate() * getGrossSales()/ 100) + baseSalary;
		return super.earnings() + baseSalary;
	}

	// This method override the default toString method
	@Override
	public String toString() {
		return String.format("%s%nBase Salary = $%,.2f%n", super.toString(), baseSalary);
	}
	
} // end class
