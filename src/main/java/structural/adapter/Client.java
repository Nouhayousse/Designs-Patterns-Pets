package structural.adapter;

public class Client {
    public static void main(String[] args){
        PaymentProcessor paymentProcessor= new PaymentAdapter(new StripeGateway());
        paymentProcessor.pay(150.50);
    }
}
