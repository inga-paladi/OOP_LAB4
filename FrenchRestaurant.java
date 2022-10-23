import java.util.ArrayList;
import java.util.Random;

class FrenchRestaurant extends Restaurant  {

	public FrenchRestaurant() {
		// System.out.println("French restaurant created");
		super.employees = new ArrayList<>();
		super.tables = new ArrayList<>();
		super.menu = new FrenchMenu();

		initFrenchRestaurant();
	}
	
	private void initFrenchRestaurant() {
		initTables();

		addEmployee(new Cashier());
		addEmployee(new Manager());

		for (int i = 0; i < 2; i++) {
			addEmployee(new Waiter());
			addEmployee(new Cheff());
		}
	
	}

	private void initTables() {
		int nrOfTables = 0;
		Random random = new Random();

		for (int i = 0; i < 10; i++)
		{
			++nrOfTables;
			int nrOfSeats = random.nextInt(4) + 1; // [1; 4]
			super.tables.add(new VipTable(nrOfTables, nrOfSeats));
		}
		
		for (int i = 0; i < 10; i++)
		{
			++nrOfTables;
			int nrOfSeats = random.nextInt(4) + 1; // [1; 4]
			super.tables.add(new SimpleTable(nrOfTables, nrOfSeats));
		}
		
		super.nrOfFreeTables = nrOfTables;
	}
	
	public void operate() { }
	
	public boolean addEmployee(Employee employee) {
		super.employees.add(employee);
		return true;
	}
	
}
