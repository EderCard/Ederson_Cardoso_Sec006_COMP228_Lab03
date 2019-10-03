package ederson_cardoso_exercise1;

public abstract class Employee {
	// instance data members
	private int employeeId;
	private String firstName;
	private String lastName;

	// Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	} // end getters and setters

	/**
	 * Constructor with all parameters
	 * 
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 */
	public Employee(int employeeId, String firstName, String lastName) {

		// Validate negative value
		if (employeeId < 0) {
			throw new IllegalArgumentException("EmployeeId cannot be negative");
		} else {
			this.employeeId = employeeId;
		}

		// Validate null value for firstName
		if (firstName == null || firstName.isEmpty()) {
			throw new IllegalArgumentException("First name cannot be null");
		} else {
			this.firstName = firstName;
		}

		// Validate null value for lastName
		if (lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException("Last name cannot be null");
		} else {
			this.lastName = lastName;
		}
	} // end constructor

	// abstract class, they don't have body
	public abstract double earnings();

	@Override
	public String toString() {
		return String.format("Employee Id = %s%nFirst Name = %s%nLast Name = %s%n", employeeId, firstName, lastName);
	}

}
