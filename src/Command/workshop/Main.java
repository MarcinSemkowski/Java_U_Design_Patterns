package Command.workshop;

import Command.workshop.command.RobotCutCommand;
import Command.workshop.command.RobotDrillCommand;
import Command.workshop.command.RobotTurnOffCommand;
import Command.workshop.command.RobotTurnOnCommand;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();

        workshopApp.run();


    }

}
