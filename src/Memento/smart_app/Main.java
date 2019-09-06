package Memento.smart_app;

public class Main {

    public static void main(String[] args) {
        SmartAppCareTaker smartAppCareTaker = new SmartAppCareTaker();
        SmartApp smartApp = new SmartApp();
        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);
        smartAppCareTaker.addMemento(smartApp.save());
       smartApp.load(smartAppCareTaker.getMemento(0));

    }

}
