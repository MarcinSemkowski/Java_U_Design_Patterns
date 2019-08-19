package Factory.units;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitInfantryType type) {
        switch (type){
            case OFFICER:
                return new Officer(30,0,20);
            case RIFLEMAN:
                return new Rifleman(10,0,10);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");

        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitMechanizedType type) {
        switch (type){
            case TANK:
                return new Tank(100,0,60);
            case TANK_DESTROYER:
                return new TankDestroyer(40,0,90);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");


        }
    }

    @Override
    public AirUnit createAirUnit(UnitAirType type) {
        switch (type){
            case STRIKE_AIRCRAFT:
                return new StrikeAircraft(80,0,250);
            case BOMBER:
                return new Bomber(140,0,160);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");


        }
    }
}
