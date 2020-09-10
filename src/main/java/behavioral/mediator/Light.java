package behavioral.mediator;

//Receiver
public class Light {

    private boolean isOn = false;
    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        System.out.println(location + ": light switched on");
    }

    public void off() {
        System.out.println(location + ": light switched off");
    }

    public String getLocation() {
        return location;
    }
}
