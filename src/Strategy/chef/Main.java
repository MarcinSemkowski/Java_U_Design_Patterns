package Strategy.chef;

import Strategy.chef.egg_cooker.HardBoiledEggCooker;
import Strategy.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {
        //Nowe zamówienie - jajka na twardo
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCookerStrategy(new HardBoiledEggCooker());
        chef.cook();
        //Noew zamówienie - jajka na miekko!
        chef.setEggCookerStrategy(new SoftBoiledEggCooker());
        chef.cook();
    }
}
