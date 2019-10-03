package ederson_cardoso_exercise1;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("---CommisssionEmployee Test---");
		CommissionEmployee commissionEmployee = new CommissionEmployee(1, "Ederson", "Cardoso", 1500.0, .5);
		System.out.println(commissionEmployee.toString());

		// *************************************************************************************
		System.out.println("---BasePluCommissionEmployee Test---");
		// Default constructor with all arguments
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(2, "Rose", "Smith", 500.00, 0.5, 1000.0);
		System.out.println(basePlusCommissionEmployee.toString());

		
		// *************************************************************************************
		System.out.println("---HourlyEmployee Test---");
		HourlyEmployee hourlyEmployee = new HourlyEmployee(3, "Samantha", "Care", 40.0, 16.0);
		System.out.println(hourlyEmployee.toString());

		// *************************************************************************************
		System.out.println("---SalariedEmployee Test---");
		SalariedEmployee salariedEmployee = new SalariedEmployee(4, "Matin", "Back", 500);
		System.out.println(salariedEmployee.toString());

		
		// *************************************************************************************
		System.out.println("---PieceWorker Test---");
		PieceWorker pieceWorker = new PieceWorker(4, "Susy", "Macan", 500, 2000);
		System.out.println(pieceWorker.toString());

		
	} // end main
} // and class
