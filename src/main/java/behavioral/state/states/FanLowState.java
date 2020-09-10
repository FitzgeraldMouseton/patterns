package behavioral.state.states;

import behavioral.state.Fan;

public class FanLowState extends State {

    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to MEDIUM");
        fan.setState(fan.getFanMediumState());
    }

    @Override
    public String toString() {
        return "Fan is LOW.";
    }
}
