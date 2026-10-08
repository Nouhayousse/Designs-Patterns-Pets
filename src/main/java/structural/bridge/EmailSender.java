package structural.bridge;

public class EmailSender implements Sender{


    @Override
    public void sendMessage(String msg) {
        System.out.println("Email : "+ msg);
    }
}
