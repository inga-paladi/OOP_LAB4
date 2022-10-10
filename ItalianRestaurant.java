import java.util.ArrayList;

class ItalianRestaurant extends Restaurant  {

	public ItalianRestaurant() {
		System.out.println("Italian restaurant created");

		employees = new ArrayList<>();
		tables = new ArrayList<>();
		menu = new ItalianMenu();

		initTables();
	}

	private void initTables() {
		for (int i = 0; i < 3; i++)
			tables.add(new VipTable());

		for (int i = 0; i < 15; i++)
			tables.add(new SimpleTable());

		tables.add(new ChildrenTable());
	}

	public void operate() {	}

	public boolean addEmployee(Employee employee) {
		employees.add(employee);
		return true;
	}

}
