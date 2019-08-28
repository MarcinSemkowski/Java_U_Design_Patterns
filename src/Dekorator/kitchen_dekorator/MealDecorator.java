package Dekorator.kitchen_dekorator;

public class MealDecorator extends Meal {

     Meal meal;


    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
