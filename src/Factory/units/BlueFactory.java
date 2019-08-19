package Factory.units;

public class BlueFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitInfantryType type) {
        switch (type){
            case OFFICER:
                return new Officer(40,0,10);
            case RIFLEMAN:
                return new Rifleman(25,0,5);
             default:
              throw  new UnsupportedOperationException("Nieznany Typ ");

        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitMechanizedType type) {
        switch (type){
            case TANK:
                return new Tank(120,0,40);
            case TANK_DESTROYER:
                return new TankDestroyer(70,0,60);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");


        }
    }

    @Override
    public AirUnit createAirUnit(UnitAirType type) {
        switch (type){
            case STRIKE_AIRCRAFT:
                return new StrikeAircraft(120,0,150);
            case BOMBER:
                return new Bomber(200,0,80);
            default:
                throw  new UnsupportedOperationException("Nieznany Typ ");


        }
    }
}
