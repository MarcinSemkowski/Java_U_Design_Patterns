package Factory.car_factory;

public class ContinentalFactory extends Factory {
    @Override
    public Car buildBMW(BMWModel type) {
        switch (type){
            case X5:
                return new BMW(type.getEngineCapacity()
                        ,type.getFuelType()
                        ,type.getYearOfProduction()
                        ,SteeringWheelPositionType.LEFT);
            case E60:
                return new BMW(type.getEngineCapacity()
                        ,type.getFuelType()
                        ,type.getYearOfProduction()
                        ,SteeringWheelPositionType.LEFT);
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
                        ,SteeringWheelPositionType.LEFT);
            case FOCUS:
                return new Ford(type.getEngineCapacity()
                        ,type.getFuelType()
                        ,type.getYearOfProduction()
                        ,SteeringWheelPositionType.LEFT);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");
        }
    }
}
