public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("mobil_pay")) {
            System.out.println("Processing mobile payment: " + amount + " CFA");
        } else if (paymentType.equals("credit_card")) {
            System.out.println("Processing credit card payment: " + amount + " CFA");
        } else if (paymentType.equals("paypal")) {
            System.out.println("Processing PayPal payment: " + amount + " CFA");
        } else if (paymentType.equals("crypto")) {
            System.out.println("Processing crypto payment: " + amount + " CFA");
        }
    }
}