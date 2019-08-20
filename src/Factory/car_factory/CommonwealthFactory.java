package Factory.car_factory;

public class CommonwealthFactory extends  Factory {

    @Override
    public Car buildBMW(BMWModel type) {
        switch (type){
            case X5:
                return new BMW(type.getEngineCapacity()
                        ,type.getFuelType()
                        ,type.getYearOfProduction()
                        ,SteeringWheelPositionType.RIGHT);
            case E60:
                return new BMW(type.getEngineCapacity()
                        ,type.getFuelType()
                        ,type.getYearOfProduction()
                        ,SteeringWheelPositionType.RIGHT);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");
        }

    }

    @Override
    public Car buildFord(FordModel type) {
        switch (type){
            case CMAX:
                return new Ford(type.getEngineCapacity()
                        ,type.getFuelType()
                        ,type.getYearOfProduction()
                        ,SteeringWheelPositionType.RIGHT);
            case FOCUS:
                return new Ford(type.getEngineCapacity()
                        ,type.getFuelType()
                        ,type.getYearOfProduction()
                        ,SteeringWheelPositionType.RIGHT);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");
    }
}

}
