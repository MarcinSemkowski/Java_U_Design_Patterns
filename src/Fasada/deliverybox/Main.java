package Fasada.deliverybox;

public class Main {

    public static void main(String[] args) {
         pickupPacage();
    }

    private static void pickupPacage(){
        DeliveryBox deliveryBox = new DeliveryBox();
        DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();
        deliveryBox.getUserData();
        if(deliveryBoxSystem.isUsrDataValidated() && deliveryBoxSystem.isPaymentSecured()){
            deliveryBox.openBox();
        }

    }

}
