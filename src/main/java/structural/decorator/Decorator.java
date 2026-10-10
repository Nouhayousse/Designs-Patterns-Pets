package structural.decorator;

public abstract class Decorator implements Drink{
    protected final Drink wrapped;

    protected Decorator(Drink wrapped) {
        this.wrapped = wrapped;
    }


}
