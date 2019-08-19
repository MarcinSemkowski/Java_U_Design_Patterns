package Factory;

import Factory.units.Factory;
import Factory.units.Unit;
import Factory.units.UnitFactory;
import Factory.units.UnitType;

public class Main {
    public static void main(String[] args) {
        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);
    }
}
