package Factory.car_factory;

public enum BMWModel {

    X5("1 995 cm3",FuelType.DIESEL,2016)
    ,E60("1 995 cm3",FuelType.GASOLINE,2009);

    private String engineCapacity;

    private  FuelType fuelType;

    private int yearOfProduction;


    BMWModel(String engineCapacity, FuelType fuelType, int yearOfProduction) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
    }

}
