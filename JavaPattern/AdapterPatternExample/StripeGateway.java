package AdapterPatternExample;

// File: StripeGateway.java
public class StripeGateway {
    public void charge(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
