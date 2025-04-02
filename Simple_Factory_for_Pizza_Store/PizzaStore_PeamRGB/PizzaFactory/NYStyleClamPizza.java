package workshop2.PizzaFactory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "marinara sauce";
        toppings.add("Grated Reggiano cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
