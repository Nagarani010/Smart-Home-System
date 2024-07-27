import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Configurationmanager configManager = Configurationmanager.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Current configuration: " + configManager.getConfiguration());

        System.out.print("Enter new configuration: ");
        String newConfig = scanner.nextLine();

        configManager.setConfiguration(newConfig);

        System.out.println("Updated configuration: " + configManager.getConfiguration());
    }
}
