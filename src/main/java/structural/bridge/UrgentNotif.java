package structural.bridge;

public class UrgentNotif extends Notification{
    private String content ;
    public UrgentNotif(Sender sender, String content){
        super(sender);
        this.content=content;
    }
    @Override
    void notifyIt() {
        for(int i=1;i<=3;i++) {
            sender.sendMessage("URGENT "+content);
        }
    }
}
