
public class ItalianMenu extends Menu {

	public ItalianMenu(){
		initItalianMenu();
	}

	private void initItalianMenu() {
		addDish(new Dish("Lasagna", 38, 40));
		addDish(new Dish("Pasta con pesto", 30, 10));
		addDish(new Dish("Spaghetti Carbonara", 12, 5));
		addDish(new Dish("Gnocchi Sorrento", 20, 40));
		addDish(new Dish("Pizza quattro formaggi", 20, 40));
	}

}
