package State.states;
import State.CoffeeMachine;
public class CoinInsertedState implements State {
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta została już wrzucona ");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Zwracam monetę ");
        coffeeMachine.setState(new NoCoinState());
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Wcisnij guzik");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Nalewam kawę");
    }
}
