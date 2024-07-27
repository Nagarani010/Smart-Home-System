public class Thermostat extends Device {
    private int temperature;

    public Thermostat(int id, int initialTemperature) {
        super(id, "thermostat");
        this.temperature = initialTemperature;
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }

    @Override
    public void turnOn() {
        // Implement behavior if needed
    }

    @Override
    public void turnOff() {
        // Implement behavior if needed
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
