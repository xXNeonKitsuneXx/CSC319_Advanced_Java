package workshop2.PizzaFactory;

import workshop2.iter0sf.CheesePizza;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
           return new NYStyleCheesePizza();
        } else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        } else if(item.equals("clam")){
            return new NYStyleClamPizza();
        } else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        } return null;
    }
}
