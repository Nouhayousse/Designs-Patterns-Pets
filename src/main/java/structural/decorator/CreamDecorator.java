package structural.decorator;

public class CreamDecorator extends Decorator{
    public CreamDecorator(Drink wrapped){
        super(wrapped);
    }
    @Override
    public double cost() {
        return wrapped.cost()+6.0;
    }

    @Override
    public String description() {
        return wrapped.description()+ " with cream";
    }
}
