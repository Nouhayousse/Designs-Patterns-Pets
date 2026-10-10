package structural.decorator;

public class Espresso implements Drink{

    @Override
    public double cost() {
        return 20;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
