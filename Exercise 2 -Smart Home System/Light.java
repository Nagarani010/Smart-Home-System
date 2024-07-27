public class Light extends Device {
    private String state; // "on" or "off"

    public Light(int id) {
        super(id, "light");
        this.state = "off";
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + state;
    }

    @Override
    public void turnOn() {
        this.state = "on";
    }

    @Override
    public void turnOff() {
        this.state = "off";
    }
}
