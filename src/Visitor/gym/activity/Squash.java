package Visitor.gym.activity;

import Visitor.gym.visitor.Visitor;

public class Squash implements Activity {

private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

}
