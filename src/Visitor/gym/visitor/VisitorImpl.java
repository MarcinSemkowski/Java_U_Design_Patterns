package Visitor.gym.visitor;

import Visitor.gym.activity.Squash;
import Visitor.gym.activity.Treadmill;
import Visitor.gym.activity.Weights;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: " + treadmill.getDistance() * 3 );
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: " + squash.getMinutesPlayed() * 20 );
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned leafting weights : " +  weights.getWeight() * weights.getReps() * 2 );
    }
}
