package Visitor.gym.activity;

import Visitor.gym.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}
