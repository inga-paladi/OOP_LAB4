abstract class Table {

	public boolean available;
	public int noOfSeats;
	public int number;

	public abstract void freeUp();
	public abstract boolean occupy();
	
	public boolean isAvailable() {
		return available;
	}
}
