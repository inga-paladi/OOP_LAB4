import java.util.ArrayList;

abstract class Restaurant {
	protected String adress;
	protected ArrayList<Employee> employees;
	protected ArrayList<Waiter> waiters;
	protected Menu menu;
	protected String name;
	protected String owner;
	protected int nrOfFreeTables;
	protected ArrayList<Table> tables;
	
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

	public int getNrOfTables() {
		return tables.size();	
	}

	public int getNrOfFreeTables() {
		return nrOfFreeTables;
	}

	public boolean occupyTable(int tableNr) {
		try {
			return tables.get(tableNr).occupy();
		} catch (Exception e) {
			return false;
		}
	}

	public abstract void operate();
	public abstract boolean addEmployee(Employee employee);
	// public abstract boolean 
}
