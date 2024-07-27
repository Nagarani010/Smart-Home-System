public class DoorLock extends Device {
    private String state; // "locked" or "unlocked"

    public DoorLock(int id) {
        super(id, "door lock");
        this.state = "locked";
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + state;
    }

    @Override
    public void turnOn() {
        this.state = "locked";
    }

    @Override
    public void turnOff() {
        this.state = "unlocked";
    }
}
