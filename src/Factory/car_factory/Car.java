package Factory.car_factory;

public abstract class Car {

    private String engineCapacity;

    private  FuelType fuelType;

    private int yearOfProduction;

   private SteeringWheelPositionType  SteeringWheelPosition;

    public Car(String engineCapacity, FuelType fuelType, int yearOfProduction, SteeringWheelPositionType steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        SteeringWheelPosition = steeringWheelPosition;
    }
}
