package factorymethod;

public class ColombianCoffee extends Coffee {
    private boolean isReady;

    @Override
    public void brew() {
        this.isReady = true;
    }

    @Override
    boolean isReady() {
        return isReady;
    }
}
