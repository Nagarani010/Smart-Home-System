import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stock symbol: ");
        String stock = scanner.nextLine();

        System.out.print("Enter stock price: ");
        double price = scanner.nextDouble();

        stockMarket.setStockPrice(stock, price);
    }
}
