package Observer.notification;

import Observer.order.Order;

public class TextMessage {

   public void updateOrederStatus(Order order){
       System.out.println("SMS -  Zamówienie numer: " + order.getOrederNumber() + "zamianiło status na: " + order.getOrederStatus());
   }

}
