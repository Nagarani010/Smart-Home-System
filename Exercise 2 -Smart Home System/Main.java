import java.util.Scanner;
import java.util.List;

public class Main {
    private enum MenuOption {
        ADD_DEVICE, TURN_ON_DEVICE, TURN_OFF_DEVICE, GET_DEVICE_STATUS, SET_SCHEDULE, ADD_TRIGGER, VIEW_SCHEDULES, VIEW_TRIGGERS, EXIT, INVALID
    }

    public static void main(String[] args) {
        Homehub hub = new Homehub();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Device");
            System.out.println("2. Turn On Device");
            System.out.println("3. Turn Off Device");
            System.out.println("4. Get Device Status");
            System.out.println("5. Set Schedule");
            System.out.println("6. Add Trigger");
            System.out.println("7. View Schedules");
            System.out.println("8. View Triggers");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            MenuOption option = getMenuOption(choice);

            switch (option) {
                case ADD_DEVICE:
                    System.out.println("Enter device type (light/thermostat/door lock):");
                    String type = scanner.nextLine();
                    System.out.println("Enter device ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Device device = DeviceFactory.createDevice(type, id);
                    hub.addDevice(device);
                    System.out.println("Device added.");
                    break;
                case TURN_ON_DEVICE:
                    System.out.println("Enter device ID to turn on:");
                    id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    hub.turnOnDevice(id);
                    System.out.println("Device turned on.");
                    break;
                case TURN_OFF_DEVICE:
                    System.out.println("Enter device ID to turn off:");
                    id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    hub.turnOffDevice(id);
                    System.out.println("Device turned off.");
                    break;
                case GET_DEVICE_STATUS:
                    System.out.println("Enter device ID to get status:");
                    id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println("Status: " + hub.getDeviceStatus(id));
                    break;
                case SET_SCHEDULE:
                    System.out.println("Enter device ID for schedule:");
                    id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println("Enter schedule time (e.g., 06:00):");
                    String time = scanner.nextLine();
                    System.out.println("Enter command (e.g., Turn On):");
                    String command = scanner.nextLine();
                    hub.setSchedule(id, time, command);
                    System.out.println("Schedule set.");
                    break;
                case ADD_TRIGGER:
                    System.out.println("Enter condition for trigger:");
                    String condition = scanner.nextLine();
                    System.out.println("Enter action for trigger:");
                    String action = scanner.nextLine();
                    hub.addTrigger(condition, action);
                    System.out.println("Trigger added.");
                    break;
                case VIEW_SCHEDULES:
                    List<Schedule> schedules = hub.getSchedules();
                    System.out.println("Scheduled Tasks: " + schedules);
                    break;
                case VIEW_TRIGGERS:
                    List<Trigger> triggers = hub.getTriggers();
                    System.out.println("Automated Triggers: " + triggers);
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static MenuOption getMenuOption(int choice) {
        switch (choice) {
            case 1:
                return MenuOption.ADD_DEVICE;
            case 2:
                return MenuOption.TURN_ON_DEVICE;
            case 3:
                return MenuOption.TURN_OFF_DEVICE;
            case 4:
                return MenuOption.GET_DEVICE_STATUS;
            case 5:
                return MenuOption.SET_SCHEDULE;
            case 6:
                return MenuOption.ADD_TRIGGER;
            case 7:
                return MenuOption.VIEW_SCHEDULES;
            case 8:
                return MenuOption.VIEW_TRIGGERS;
            case 9:
                return MenuOption.EXIT;
            default:
                return MenuOption.INVALID;
        }
    }
}
