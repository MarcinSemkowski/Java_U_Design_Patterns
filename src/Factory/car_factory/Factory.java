package Factory.car_factory;

public abstract class Factory {

    public abstract Car buildBMW(BMWModel type);

    public abstract Car buildFord(FordModel type);
}
