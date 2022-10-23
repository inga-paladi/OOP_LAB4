import java.io.IOException;

public class RestaurantApp {

	private Restaurant m_restaurant;

	public void menu() {
		while (true)
		{
			if (!selectRestaurant()) break;
			if (!choseTable()) break;
			if (!callWaiter()) break;
			if (!getMenu()) break;
			if (!makeOrders()) break;
			if (!checkOut()) break;
		}
	}

	public void show() {
		System.out.println("Base menu");
	}

	protected boolean selectRestaurant() {
		System.out.println("Available restaurants:");
		System.out.println("1. French");
		System.out.println("2. Italian");
		System.out.println("OtherValue: Quit");
		
		int chosenValue;
		try{
			System.out.print(">> ");
			chosenValue = System.in.read() - 48;
		}
		catch (IOException e){
            System.out.println("Error reading from user");
			System.out.println(e.toString());
			chosenValue = 99;
        }


		if (chosenValue == 1) {
			m_restaurant = new FrenchRestaurant();
		} else if (chosenValue == 2) {
			m_restaurant = new ItalianRestaurant();
		} else {
			return false;
		}

		return true;
	}

	protected boolean choseTable() {
		if (m_restaurant.getNrOfFreeTables() == 0) {
			System.out.println("No tables available");
			return false;
		}

		int nrOfTotalTables = m_restaurant.getNrOfTables();
		
		int chosenTable;
		try {
			System.out.print("Chose a table (nr of tables is " + nrOfTotalTables + ")\n>> ");
			chosenTable = System.in.read();
			boolean occupied = m_restaurant.occupyTable(chosenTable);
			if (occupied) {
				System.out.println("Table occupied successfully");
			} else {
				System.out.println("Table already occupied");
				return false;
			}
		}
		catch (IOException e){
            System.out.println("Error reading from user");
			System.out.println(e.toString());
			return false;
        }

		return true;
	}

	protected boolean callWaiter() {
		System.out.println("Waiter came");
		return true;
	}

	protected boolean getMenu() {
		m_restaurant.getMenu().displayDishes();
		return true;
	}
	
	protected boolean makeOrders() {

		return true;
	}
	
	protected boolean checkOut() {

		return true;
	}
	
}
