package structural.decorator;

public class CaramelDecorator extends Decorator{
    public CaramelDecorator(Drink wrapped){
        super(wrapped);
    }


    @Override
    public double cost() {
        return wrapped.cost()+8.0;
    }

    @Override
    public String description() {
        return wrapped.description()+ " with caramel";
    }
}
