package Dekorator.kitchen_dekorator;

public class SauceMealDecorator extends MealDecorator {
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
          meal.prepareMeal();
         addSouce();
    }


    public void  addSouce(){
        System.out.println("Danie polewam sosem.");
    }



}
