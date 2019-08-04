package Observer.notification;

import Observer.order.Order;

public class Email implements Observer {
    @Override
    public void update(Order order){
        System.out.println("Email -  Zamówienie numer: " + order.getOrderNumber() + "zmianiło status na: " + order.getOrderStatus());
    }


}
