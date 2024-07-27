public abstract class Device {
    protected int id;
    protected String type;

    public Device(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public abstract String getStatus();
    public abstract void turnOn();
    public abstract void turnOff();
}
