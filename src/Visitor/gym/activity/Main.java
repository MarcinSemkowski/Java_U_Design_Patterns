package Visitor.gym.activity;

import Visitor.gym.visitor.Visitor;
import Visitor.gym.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);

        Visitor visitor = new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("-------------");

        List<Activity> activityList = Arrays.asList(treadmill,squash,weights);
        activityList.forEach(( Activity activity) -> activity.accept(visitor));
    }
}
