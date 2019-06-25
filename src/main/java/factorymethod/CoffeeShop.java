package factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CoffeeShop {
    private List<Coffee> coffees = new ArrayList<>();

    public CoffeeShop() {
        final Coffee firstCoffee = prepareCoffee();
        final Coffee secondCoffee = prepareCoffee();
        coffees.add(firstCoffee);
        coffees.add(secondCoffee);
    }

    public abstract Coffee prepareCoffee();

}
