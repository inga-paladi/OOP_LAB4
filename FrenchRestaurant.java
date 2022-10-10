import java.util.ArrayList;

class FrenchRestaurant extends Restaurant  {

	public FrenchRestaurant(){
		System.out.println("French restaurant created");
		employees = new ArrayList<>();
		tables = new ArrayList<>();
		menu = new FrenchMenu();

		initTables();
	}

	private void initTables() {
		for (int i = 0; i < 10; i++)
			tables.add(new VipTable());

		for (int i = 0; i < 10; i++)
			tables.add(new SimpleTable());
	}

	public void operate() { }

	public boolean addEmployee(Employee employee) {
		employees.add(employee);
		return true;
	}
	
}
