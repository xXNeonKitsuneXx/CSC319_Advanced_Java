public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		 
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = pizzaStore.orderPizza("clam");
		System.out.println("Shane ordered a " + pizza.getName() + "\n");
 
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println("Mary ordered a " + pizza.getName() + "\n");
 
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println("Mia ordered a " + pizza.getName() + "\n");
 	}
}
