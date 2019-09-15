package Fasada.deliverybox;

public class DeliveryBoxFacade {

    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPacage(){
        DeliveryBox deliveryBox = new DeliveryBox();
        DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();
        deliveryBox.getUserData();
        if(deliveryBoxSystem.isUsrDataValidated() && deliveryBoxSystem.isPaymentSecured()){
            deliveryBox.openBox();
        }

    }

}
