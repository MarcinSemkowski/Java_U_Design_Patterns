package Command.workshop.command;

import Command.workshop.CoffeeMaker;

public class CoffeeMakerTurnOffCommand implements Command {

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOffCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
      coffeeMaker.turnOn();
    }
}
