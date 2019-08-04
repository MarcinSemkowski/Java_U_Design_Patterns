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

        textMessage.updateOrederStatus(order);
        mobileApp.updateOrederStatus(order);
        email.updateOrederStatus(order);

    }
}
