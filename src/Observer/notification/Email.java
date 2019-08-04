package Observer.notification;

import Observer.order.Order;

public class Email {

    public void updateOrederStatus(Order order){
        System.out.println("Email -  Zamówienie numer: " + order.getOrederNumber() + "zamianiło status na: " + order.getOrederStatus());
    }


}
