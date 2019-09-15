package Fasada.deliverybox;

public class DeliveryBox {

    public boolean isDeliveryFull() {
        System.out.println("Delivery Box is not Full");
        return false;
    }

    public boolean isDeliveryBoxBroken() {
        System.out.println("Delivery Box is not Broken.");
        return false;
    }

    public void getUserData(){
        System.out.println("User data entered.");
    }

    public void openBox(){
        System.out.println("Box opened");
    }
}
