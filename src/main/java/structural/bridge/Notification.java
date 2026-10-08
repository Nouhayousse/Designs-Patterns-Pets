package structural.bridge;

public abstract class Notification {
    protected Sender sender;

    public Notification(Sender sender) {
        this.sender=sender;
    }

    abstract void notifyIt();
}
