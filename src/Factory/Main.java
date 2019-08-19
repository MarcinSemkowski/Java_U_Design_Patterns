package Factory;

import Factory.units.InfantryFactory;
import Factory.units.InfantryUnit;
import Factory.units.InfantryUnitFactory;
import Factory.units.UnitInfantryType;

public class Main {
    public static void main(String[] args) {
        InfantryFactory infantryFactory = new InfantryUnitFactory();
        InfantryUnit tank = infantryFactory.createUnit(UnitInfantryType.TANK);
        InfantryUnit rifleman = infantryFactory.createUnit(UnitInfantryType.RIFLEMAN);
    }
}
