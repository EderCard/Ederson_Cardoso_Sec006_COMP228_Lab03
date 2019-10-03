package ederson_cardoso_exercise1;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("---CommisssionEmployee Test---");
		CommissionEmployee commissionEmployee = new CommissionEmployee(1, "Ederson", "Cardoso", 1500.0, .5);
		System.out.println(commissionEmployee.toString());

		// *************************************************************************************
		System.out.println("---HourlyEmployee Test---");
		HourlyEmployee hourlyEmployee = new HourlyEmployee(2, "Samantha", "Care", 40.0, 16.0);
		System.out.println(hourlyEmployee.toString());
		
	} // end main
} // and class
