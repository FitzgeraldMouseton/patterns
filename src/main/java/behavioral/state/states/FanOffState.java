package behavioral.state.states;

import behavioral.state.Fan;

public class FanOffState extends State {

    private final Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to LOW");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is OFF.";
    }
}
