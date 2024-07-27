import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String stock, double price);
}

class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    private String stock;
    private double price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStockPrice(String stock, double price) {
        this.stock = stock;
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stock, price);
        }
    }
}

class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println(name + " notified. " + stock + " is now $" + price);
    }
}
