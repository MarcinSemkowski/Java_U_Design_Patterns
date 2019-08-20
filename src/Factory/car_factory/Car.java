package Factory.car_factory;

public abstract class Car {

    private String engineCapacity;

    private  FuelType fuelType;

    private int yearOfProduction;



    public Car(String engineCapacity, FuelType fuelType, int yearOfProduction) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
    }
}
