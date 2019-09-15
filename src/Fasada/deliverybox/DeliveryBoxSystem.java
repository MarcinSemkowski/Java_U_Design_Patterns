package Fasada.deliverybox;

public class DeliveryBoxSystem {

    public void sendNotification() {
        System.out.println("Text messages sent to the client");
    }

    public  boolean isPaymentSecured(){
        System.out.println("Payment has been secured");
        return true;
    }

    public boolean isUsrDataValidated(){
        System.out.println("User data has been validated");
        return true;
    }

    public void scheduleDelivery(){
        System.out.println("Delivery has been Scheduled");
    }
}
