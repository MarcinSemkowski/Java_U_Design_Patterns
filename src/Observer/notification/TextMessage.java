package Observer.notification;

import Observer.order.Order;

public class TextMessage implements Observer {
    @Override
   public void update(Order order){
       System.out.println("SMS -  Zamówienie numer: " + order.getOrderNumber() + "zmianiło status na: " + order.getOrderStatus());
   }

}
