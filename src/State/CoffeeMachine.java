package State;

import State.states.NoCoinState;
import State.states.State;

public class CoffeeMachine {

    private State state;


    public CoffeeMachine() {
        state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheButton() {
        state.pushTheButton(this);
    }

    public void takeTheCup() {
       state.takeTheCup(this);
    }

    public void returnTheCoin() {
     state.returnTheCoin(this);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
