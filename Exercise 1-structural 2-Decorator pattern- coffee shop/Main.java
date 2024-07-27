import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Current coffee: " + coffee.getDescription() + " Cost: $" + coffee.cost());

        System.out.print("Add milk? (yes/no): ");
        String addMilk = scanner.nextLine();

        if (addMilk.equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.println("Final coffee: " + coffee.getDescription() + " Cost: $" + coffee.cost());
    }
}
