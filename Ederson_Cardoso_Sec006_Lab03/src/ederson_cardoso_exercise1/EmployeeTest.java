package ederson_cardoso_exercise1;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee[] empployeeArray = { 
				new CommissionEmployee(1, "Ederson", "Cardoso", 1500.0, .5),
				new BasePlusCommissionEmployee(2, "Rose", "Smith", 500.00, 0.5, 1000.0),
				new HourlyEmployee(3, "Samantha", "Care", 40.0, 16.0),
				new SalariedEmployee(4, "Matin", "Back", 500),
				new PieceWorker(5, "Susy", "Macan", 500, 2000)};

		for(Employee emp: empployeeArray) {
			// print object class name
			System.out.println(emp.getClass().getName());
			
			System.out.println(emp.toString());
			System.out.printf("Earnings = $%,.2f%n", emp.earnings());
			System.out.println("-------------------------------------");
		}

	} // end main

} // and class
