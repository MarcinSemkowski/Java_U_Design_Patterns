package Visitor.gym.visitor;

import Visitor.gym.activity.Squash;
import Visitor.gym.activity.Treadmill;
import Visitor.gym.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);




}
