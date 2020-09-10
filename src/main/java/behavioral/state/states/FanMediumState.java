package behavioral.state.states;

import behavioral.state.Fan;

public class FanMediumState extends State {

    private final Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan OFF");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is MEDIUM.";
    }
}
