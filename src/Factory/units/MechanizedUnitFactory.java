package Factory.units;


public class MechanizedUnitFactory extends MechanizedFactory {
    @Override
    public MechanizedUnit createUnit(UnitMechanizedType unitMechanizedType) {
        switch (unitMechanizedType){
            case TANK:
                return new Tank(200,0,20);
            case STRIKE_AIRCRAFT:
                return new StrikeAircraft(50,0,30);

            default:
                throw new UnsupportedOperationException("No such type");
        }

    }
}
