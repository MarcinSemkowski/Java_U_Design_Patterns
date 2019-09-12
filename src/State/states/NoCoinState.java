package State.states;
import State.CoffeeMachine;
public class NoCoinState implements State {
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta została wrzucona");
        coffeeMachine.setState(new CoinInsertedState());
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuc monete");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuc monete");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuc monete");
    }

}
