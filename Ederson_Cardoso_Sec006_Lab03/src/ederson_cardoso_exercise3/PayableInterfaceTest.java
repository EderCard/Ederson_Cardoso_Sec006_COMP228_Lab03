// Payable interface test program processing Invoices and 
// Employees polymorphically.
package ederson_cardoso_exercise3;

public class PayableInterfaceTest {
	public static void main(String[] args) {
		// create four-element Payable array
		IPayable[] payableObjects = new IPayable[] { 
				new Invoice("01234", "seat", 2, 375.00),
				new Invoice("56789", "tire", 4, 79.95), 
				new CommissionEmployee(1, "Ederson", "Cardoso", 1500.0, .5),
				new BasePlusCommissionEmployee(2, "Rose", "Smith", 500.00, 0.5, 1000.0),
				new HourlyEmployee(3, "Samantha", "Care", 40.0, 16.0), 
				new SalariedEmployee(4, "Matin", "Back", 500), };

		// generically process each element in array payableObjects
		for (IPayable currentPayable : payableObjects) {
			// print object class name
			System.out.println(currentPayable.getClass().getName());
			
			// print string representation for each object
			System.out.println(currentPayable.toString());
			
			// increase 10% on base salary for BasePlusCommissionEmployee
			if (currentPayable instanceof BasePlusCommissionEmployee) 
			{
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("New base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			} 
			// increase $2.00 on hour rate for HourlyEmployee
			else if (currentPayable instanceof HourlyEmployee)
			{
				HourlyEmployee employee = (HourlyEmployee) currentPayable;
				employee.setHourRate(2 + employee.getHourRate());
				System.out.printf("New hour rate with $2.00 add is: $%,.2f%n", employee.getHourRate());
			}
			
			// print payment amount for each object
			System.out.printf("Payment Due: $%,.2f%n", currentPayable.getPaymentAmount());
			System.out.println("-------------------------------------");
		} // end loop
	
	} // end main
} // end class
