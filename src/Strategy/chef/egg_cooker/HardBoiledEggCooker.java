package Strategy.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCookerStrategy {
    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na twardo !");
    }
}
