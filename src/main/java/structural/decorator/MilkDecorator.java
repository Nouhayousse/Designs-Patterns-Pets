package structural.decorator;

public class MilkDecorator extends Decorator{
    public MilkDecorator(Drink wrapped){
        super(wrapped);
    }

    @Override
    public double cost() {
        return wrapped.cost()+ 5.0;
    }

    @Override
    public String description() {
        return wrapped.description()+ " with milk";
    }
}
