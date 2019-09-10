package Visitor.gym.activity;

public class Weights {

private int weight;
private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    public  void calculateCaloriesBurned(){
        System.out.println("Calories burned leafting weights : " + weight * reps * 2 );
    }
}
