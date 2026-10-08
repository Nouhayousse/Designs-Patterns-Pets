package structural.bridge;

public class SMSSender implements Sender{


    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS : "+msg);
    }
}
