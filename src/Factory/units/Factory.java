package Factory.units;

public abstract class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitInfantryType type);
    abstract public MechanizedUnit createMechanizedUnit(UnitMechanizedType type);
    abstract public AirUnit createAirUnit(UnitAirType type);
}
