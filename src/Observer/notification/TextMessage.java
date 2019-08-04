package Observer.notification;

import Observer.order.Order;

public class TextMessage implements Observer {
    @Override
   public void update(Order order){
       System.out.println("SMS -  Zamówienie numer: " + order.getOrederNumber() + "zamianiło status na: " + order.getOrederStatus());
   }

}
