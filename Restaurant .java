import java.util.ArrayList;

abstract class Restaurant {
	public String adress;
	public ArrayList<Employee> employees;
	public Menu menu;
	public String name;
	public String owner;
	public ArrayList<Table> tables;
	
	public ArrayList<Table> getFreeTable() {
		ArrayList<Table> freeTables = new ArrayList<>();
		for (Table table: tables)
		{
			if (table.isAvailable())
				freeTables.add(table);
		}
		return freeTables;
	}

	public Menu getMenu() {
		return menu;
	}

	public abstract void operate();
	public abstract boolean addEmployee(Employee employee);
}
