import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homehub {
    private Map<Integer, Device> devices;
    private List<Schedule> schedules;
    private List<Trigger> triggers;

    public Homehub() {
        this.devices = new HashMap<>();
        this.schedules = new ArrayList<>();
        this.triggers = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.put(device.getId(), device);
    }

    public void turnOnDevice(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("Device not found.");
        }
    }

    public void turnOffDevice(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOff();
        } else {
            System.out.println("Device not found.");
        }
    }

    public String getDeviceStatus(int id) {
        Device device = devices.get(id);
        if (device != null) {
            return device.getStatus();
        } else {
            return "Device not found.";
        }
    }

    public void setSchedule(int id, String time, String command) {
        schedules.add(new Schedule(id, time, command));
    }

    public void addTrigger(String condition, String action) {
        triggers.add(new Trigger(condition, action));
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }
}
