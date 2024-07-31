package AdapterPatternExample;

// File: AdapterPatternTest.java
public class AdapterPatternTest {
    public static void main(String[] args) {
        // Using PayPal payment gateway
        PayPalGateway payPal = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        payPalProcessor.processPayment(100.0);

        // Using Stripe payment gateway
        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(200.0);
    }
}
