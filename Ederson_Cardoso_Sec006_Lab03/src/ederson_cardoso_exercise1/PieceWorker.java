package ederson_cardoso_exercise1;

public class PieceWorker extends Employee {
	// instance data members
	private int numberOfPieces;
	private double wagePerPiece;

	// Getters and Setters
	public int getNumberOrPieces() {
		return numberOfPieces;
	}

	public void setNumberOrPieces(int numberOfPieces) {
		// Validate negative value
		if (numberOfPieces < 0) {
			throw new IllegalArgumentException("Number os pieces must be positive");
		} else {
			this.numberOfPieces = numberOfPieces;
		}
	}

	public double getWagePerPiece() {
		return wagePerPiece;
	}

	public void setWagePerPiece(double wagePerPiece) {
		// Validate negative value
		if (wagePerPiece < 0) {
			throw new IllegalArgumentException("Wage per pieces must be positive");
		} else {
			this.wagePerPiece = wagePerPiece;
		}
	}

	/**
	 * Constructor with all parameters
	 * 
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param numberOfPieces
	 * @param wagePerPiece
	 */
	public PieceWorker(int employeeId, String firstName, String lastName, int numberOfPieces, double wagePerPiece) {

		super(employeeId, firstName, lastName);

		setNumberOrPieces(numberOfPieces);

		setWagePerPiece(wagePerPiece);
	} // end constructor

	// This method calculate earnings based on numberOfPieces and wagePerPiece
	@Override
	public double earnings() {
		return getNumberOrPieces() * getWagePerPiece();
	}

	@Override
	public String toString() {
		return String.format("%s%nNumber Of Pieces = %s%nWage Per Piece = $%,.2f%n",
				super.toString(), numberOfPieces, wagePerPiece);
	}

} // end class
