
public class FrenchMenu extends Menu {

	public FrenchMenu(){
		initFrenchMenu();
	}

	private void initFrenchMenu() {
		addDish(new Dish("Croissant", 10, 40));
		addDish(new Dish("Baguette", 2, 0));
		addDish(new Dish("Bruschette", 4, 5));
		addDish(new Dish("Fromage mozzarella", 14, 3));
	}

}