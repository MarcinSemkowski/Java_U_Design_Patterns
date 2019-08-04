package Observer.notification;

import Observer.order.Order;

public class MobileApp {

    public void updateOrederStatus(Order order){
        System.out.println("Aplikacja mobilna -  Zamówienie numer: " + order.getOrederNumber() + "zamianiło status na: " + order.getOrederStatus());
    }

}
