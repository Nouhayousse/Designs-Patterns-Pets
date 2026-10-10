package structural.decorator;

public class Tea implements Drink{

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Tea";
    }
}
