package Command.workshop.command;

import Command.workshop.CoffeeMaker;

public class CoffeMakerTurnOffCommand implements Command {

    private CoffeeMaker coffeeMaker;

    public CoffeMakerTurnOffCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOff();
    }
}
