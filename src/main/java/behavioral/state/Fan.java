package behavioral.state;

import behavioral.state.states.FanLowState;
import behavioral.state.states.FanMediumState;
import behavioral.state.states.FanOffState;
import behavioral.state.states.State;

public class Fan {

    private final State fanOffState;
    private final State fanLowState;
    private final State fanMediumState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
