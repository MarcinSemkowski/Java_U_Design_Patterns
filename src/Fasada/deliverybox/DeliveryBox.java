package Fasada.deliverybox;

public class DeliveryBox {

     boolean isDeliveryFull() {
        System.out.println("Delivery Box is not Full");
        return false;
    }

     boolean isDeliveryBoxBroken() {
        System.out.println("Delivery Box is not Broken.");
        return false;
    }

     void getUserData(){
        System.out.println("User data entered.");
    }

     void openBox(){
        System.out.println("Box opened");
    }
}
