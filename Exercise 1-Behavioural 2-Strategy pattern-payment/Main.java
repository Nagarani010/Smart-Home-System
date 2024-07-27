import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment method (creditcard/paypal): ");
        String method = scanner.nextLine();

        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();

        if (method.equalsIgnoreCase("creditcard")) {
            System.out.print("Enter credit card number: ");
            String cardNumber = scanner.next();
            context.setPaymentStrategy(new CreditCardPayment(cardNumber));
        } else if (method.equalsIgnoreCase("paypal")) {
            System.out.print("Enter PayPal email: ");
            String email = scanner.next();
            context.setPaymentStrategy(new PayPalPayment(email));
        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        context.pay(amount);
    }
}
