package Observer;

import Observer.notification.Email;
import Observer.notification.MobileApp;
import Observer.notification.TextMessage;
import Observer.order.Order;
import Observer.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZARAJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp= new MobileApp();
        Email email = new Email();

       order.registerObserver(textMessage);
       order.registerObserver(mobileApp);
       order.registerObserver(email);

       order.notifyObservers();

        System.out.println("--------------------------------------");


        order.changedOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);

        System.out.println("-------------------------------------");

        order.changedOrderStatus(OrderStatus.ODEBRANE);

    }
}
