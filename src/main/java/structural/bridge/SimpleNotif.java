package structural.bridge;

public class SimpleNotif extends Notification{
    private String content;
    public SimpleNotif(Sender sender , String content){
        super(sender);
        this.content=content;
    }
    @Override
    void notifyIt() {
        sender.sendMessage(content);

    }
}
