package Factory;


import Factory.units.*;

public class Main {
    public static void main(String[] args) {
         Factory blueFactory = new BlueFactory();
        Factory redFactory = new BlueFactory();


        MechanizedUnit redTank =  redFactory.createMechanizedUnit(UnitMechanizedType.TANK);
        InfantryUnit redRifleman = redFactory.createInfantryUnit(UnitInfantryType.RIFLEMAN);

        MechanizedUnit blueTank =  blueFactory.createMechanizedUnit(UnitMechanizedType.TANK);
        InfantryUnit blueRifleman = blueFactory.createInfantryUnit(UnitInfantryType.RIFLEMAN);
        AirUnit blueBomber = blueFactory.createAirUnit(UnitAirType.BOMBER);
        AirUnit redBomber = redFactory.createAirUnit(UnitAirType.BOMBER);
    }
}
