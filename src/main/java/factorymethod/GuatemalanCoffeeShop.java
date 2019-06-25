package factorymethod;

public class GuatemalanCoffeeShop extends CoffeeShop {
    @Override
    public Coffee prepareCoffee() {
        return new GuatemalanCoffee();
    }
}
