package TemplateMethod;

public class AutomaticTenasmissionStartingSequence extends ClassicCarStartingSequence {

    @Override
    public void setTheGear() {
        System.out.println("Automatic");
    }
}
