package structural.adapter;

public class StripeGateway {
    public void charge(int amountCents, String currency){
        System.out.println("Stripe a debite "+amountCents+" cents en devise "+currency);
    }
}
