
interface PaymentMethod {
    void process(double amount);
}


class MobilePay implements PaymentMethod {
    public void process(double amount) { System.out.println("Processing mobile payment: " + amount + " CFA"); }
}

class CryptoPay implements PaymentMethod {
    public void process(double amount) { System.out.println("Processing crypto payment: " + amount + " CFA"); }
}


class PaymentProcessor {
    public void processPayment(PaymentMethod method, double amount) {
        method.process(amount);
    }
}