public class PaymentProcessor {

    public void processPayment() {
        int amount = 100;
        int result = amount / 0; // Critical bug
        System.out.println(result);
    }
}