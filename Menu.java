import java.util.ArrayList;

public class Menu {

	protected ArrayList<Dish> dishes;

	public Menu(){
		this.dishes = new ArrayList<>();
	}

	void displayDishes() {
		for (int i = 0; i < dishes.size(); i++) {
			Dish dish = dishes.get(i);
			System.out.println(String.valueOf(i+1)
				+ ". "
				+ dish.Name
				+ ". $"
				+ dish.Price
				+ ". AvgPrep: "
				+ dish.AvgPrepTime
				+ " min");
		}
	}

	void addDish(Dish dish)
	{
		dishes.add(dish);
	}

	ArrayList<Dish> getDishes() {
		return dishes;
	}
}
