package Fasada.deliverybox;

public class DeliveryBoxSystem {

     void sendNotification() {
        System.out.println("Text messages sent to the client");
    }

      boolean isPaymentSecured(){
        System.out.println("Payment has been secured");
        return true;
    }

     boolean isUsrDataValidated(){
        System.out.println("User data has been validated");
        return true;
    }

     void scheduleDelivery(){
        System.out.println("Delivery has been Scheduled");
    }
}
