abstract class Table {

	protected boolean available;
	protected int noOfSeats;
	protected int number;

	public Table(int number, int noOfSeats) {
		this.number = number;
		this.noOfSeats = noOfSeats;
		this.available = true;
	}

	public abstract void freeUp();

	public boolean occupy() {
		if (available)
			available = true;
		else
			return false;

		return true;
	}
	
	public boolean isAvailable() {
		return available;
	}
}
