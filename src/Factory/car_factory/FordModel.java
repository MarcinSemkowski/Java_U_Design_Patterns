package Factory.car_factory;

public enum FordModel {

CMAX("998 cm3",FuelType.GASOLINE,2013)
    ,FOCUS("1 560 cm3",FuelType.DIESEL,2011);


    private String engineCapacity;

    private  FuelType fuelType;

    private int yearOfProduction;


    FordModel(String engineCapacity, FuelType fuelType, int yearOfProduction) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
