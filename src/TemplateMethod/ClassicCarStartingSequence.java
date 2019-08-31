package TemplateMethod;

public class ClassicCarStartingSequence extends CarStartingSequence {



     @Override
    public void setTheGear() {
        System.out.println("Wybieramy bieg");
    }
    @Override
    public void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }


}
