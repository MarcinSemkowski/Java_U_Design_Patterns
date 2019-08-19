package Factory.units;

public class InfantryUnitFactory extends InfantryFactory {

    @Override
    public InfantryUnit createInfantryUnit(UnitInfantryType unitInfantryType) {
        switch (unitInfantryType){
            case OFFICER:
                return new Officer(100,0,30);
            case RIFLEMAN:
                return new Rifleman(100,0,10);

            default:
                throw new UnsupportedOperationException("No such type");
        }

    }
}
