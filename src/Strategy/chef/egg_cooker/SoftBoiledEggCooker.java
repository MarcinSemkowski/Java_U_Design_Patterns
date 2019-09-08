package Strategy.chef.egg_cooker;

public class SoftBoiledEggCooker implements EggCookerStrategy {
    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na miękko !");
    }
}
