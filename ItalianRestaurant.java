import java.util.ArrayList;
import java.util.Random;

class ItalianRestaurant extends Restaurant  {

	public ItalianRestaurant() {
		// System.out.println("Italian restaurant created");

		employees = new ArrayList<>();
		tables = new ArrayList<>();
		menu = new ItalianMenu();

		initItalianRestaurant();
	}
	
	private void initItalianRestaurant() {
		initTables();
		addEmployee(new Cashier());
		addEmployee(new Manager());
		addEmployee(new Manager());
	
		for (int i = 0; i < 4; i++) {
			addEmployee(new Waiter());
			addEmployee(new Cheff());
		}

	}

	private void initTables() {
		int nrOfTables = 0;
		Random random = new Random();

		for (int i = 0; i < 3; i++)
		{
			++nrOfTables;
			int nrOfSeats = random.nextInt(4) + 1; // [1; 4]
			tables.add(new VipTable(nrOfTables, nrOfSeats));
		}

		for (int i = 0; i < 15; i++)
		{
			++nrOfTables;
			int nrOfSeats = random.nextInt(4) + 1; // [1; 4]
			tables.add(new SimpleTable(nrOfTables, nrOfSeats));
		}

		++nrOfTables;
		tables.add(new ChildrenTable(nrOfTables, 4));

		super.nrOfFreeTables = nrOfTables;
	}

	public void operate() {	}

	public boolean addEmployee(Employee employee) {
		employees.add(employee);
		return true;
	}

}
