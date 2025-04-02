package workshop2.PizzaFactory;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
