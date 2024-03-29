package Visitor.gym.activity;

import Visitor.gym.visitor.Visitor;

public class Treadmill implements Activity {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }

    public int getDistance() {
        return distance;
    }

}
