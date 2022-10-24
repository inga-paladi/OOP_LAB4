import java.util.ArrayList;
import java.util.Scanner;

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
		
		System.out.print(">> ");
		int chosenValue = readInt();
		
		switch (chosenValue) {
			case 1: {
				m_restaurant = new FrenchRestaurant();
				break;
			}
			case 2: {
				m_restaurant = new ItalianRestaurant();
				break;	
			}
			default: {
				System.out.println("Unknown value");
				return false;
			}
		}

		return true;
	}

	protected boolean choseTable() {
		if (m_restaurant.getNrOfFreeTables() == 0) {
			System.out.println("No tables available");
			return false;
		}

		int nrOfTotalTables = m_restaurant.getNrOfTables();
		
		System.out.print("Chose a table (nr of tables is " + nrOfTotalTables + ")\n>> ");
		int chosenTable = readInt();
		if (chosenTable > 0 && chosenTable <= nrOfTotalTables) {
			boolean occupied = m_restaurant.occupyTable(chosenTable);
			if (occupied) {
				System.out.println("Table occupied successfully");
				return true;
			} else {
				System.out.println("Table already occupied");
				return false;
			}
		} else {
			System.out.println("Table does not exist");
			return false;
        }
	}

	protected boolean callWaiter() {
		System.out.println("Waiter came");
		return true;
	}

	protected boolean getMenu() {
		m_restaurant.getMenu().displayDishes();
		return true;
	}
	
	protected ArrayList<Dish> orderedDishes;

	protected boolean makeOrders() {
		orderedDishes = new ArrayList<>();
		ArrayList<Dish> dishes = m_restaurant.getMenu().getDishes();

		while (true) {
			System.out.print("Select dish >> ");
			int chosenDishIx = readInt();
	
			if (chosenDishIx > 0 && chosenDishIx <= dishes.size()) {
				orderedDishes.add(dishes.get(chosenDishIx));
				System.out.println(dishes.get(chosenDishIx).Name + " ordered successfully");
			} else {
				System.out.println("No dish found");
				break;
			}
		}

		if (orderedDishes.size() == 0) {
			return false;
		}
		return true;
	}
	
	protected boolean checkOut() {
		float sumToPay = 0;

		for (Dish dish: orderedDishes) {
			sumToPay += dish.Price;
		}

		System.out.print("Price to pay: $");
		System.out.println(sumToPay);
		System.out.println("Pay and exit\n");
		readInt();
		return true;
	}

	protected int readInt() {
		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			return -1;
		}
	}
	
}
