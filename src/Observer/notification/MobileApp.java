package Observer.notification;

import Observer.order.Order;

public class MobileApp implements Observer {
      @Override
    public void update(Order order){
        System.out.println("Aplikacja mobilna -  Zamówienie numer: " + order.getOrederNumber() + "zamianiło status na: " + order.getOrederStatus());
    }

}
