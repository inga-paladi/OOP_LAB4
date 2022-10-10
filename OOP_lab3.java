
public class OOP_lab3 {
	public static void main(String[] args) {
		ItalianMenu child = new ItalianMenu();
		Menu parent = child;


		FrenchRestaurant frenchRestaurant = new FrenchRestaurant();

		frenchRestaurant.addEmployee(new Cashier());
		frenchRestaurant.addEmployee(new Manager());

		for (int i = 0; i < 2; i++) {
			frenchRestaurant.addEmployee(new Waiter());
			frenchRestaurant.addEmployee(new Cheff());
		}

		ItalianRestaurant italianRestaurant = new ItalianRestaurant();
		
		italianRestaurant.addEmployee(new Cashier());
		italianRestaurant.addEmployee(new Manager());
		italianRestaurant.addEmployee(new Manager());
	
		for (int i = 0; i < 4; i++) {
			italianRestaurant.addEmployee(new Waiter());
			italianRestaurant.addEmployee(new Cheff());
		}
	}

}


	

