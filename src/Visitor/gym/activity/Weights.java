package Visitor.gym.activity;

import Visitor.gym.visitor.Visitor;

public class Weights implements Activity {

private int weight;
private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getReps() {
        return reps;
    }

    public int getWeight() {
        return weight;
    }

}
