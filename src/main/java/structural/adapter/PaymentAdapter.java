package structural.adapter;

public class PaymentAdapter implements PaymentProcessor{

    // instance (par composition)
    private StripeGateway stripeGateway;

    public PaymentAdapter(StripeGateway stripeGateway){
        this.stripeGateway=stripeGateway;
    }

    @Override
    public void pay(double amountMad) {
        int amountCents= convertMadToCents(amountMad);
        String currency="MAD";

        stripeGateway.charge(amountCents,currency);


    }

    private int convertMadToCents(double amountMad) {
        return (int) Math.round(amountMad*100);
    }
}
