package factorymethod;

public class ColombianCoffeeShop extends CoffeeShop {

    public Coffee brew(String origin) {
        if (origin.equals("Colombian")) return new ColombianCoffee();
        return new GuatemalanCoffee();
    }

    @Override
    public Coffee prepareCoffee() {
        return new ColombianCoffee();
    }
}
