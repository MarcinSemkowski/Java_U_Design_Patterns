package State.states;
import State.CoffeeMachine;
public class CupFullState implements State {
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Zabierz kubek ");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Za pozno");

    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Zabrano kubek");
        coffeeMachine.setState(new NoCoinState());
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Zabierz najpierw kubek");
    }
}
