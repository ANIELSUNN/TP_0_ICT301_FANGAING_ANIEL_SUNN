// Le "Main" est obligé de connaître les noms exacts des types (Couplage fort)
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("mobil_pay", 1500);
        processor.processPayment("credit_card", 6500);
    }
}