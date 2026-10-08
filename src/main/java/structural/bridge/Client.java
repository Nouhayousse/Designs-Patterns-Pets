package structural.bridge;

public class Client {
    public static void  main(String[] args){
        UrgentNotif urgentNotif=new UrgentNotif(new EmailSender(),"wlahma katmergui !");
        urgentNotif.notifyIt();
        SimpleNotif simpleNotif=new SimpleNotif(new SMSSender(),"salam cv 3lik");
        simpleNotif.notifyIt();
    }
}
