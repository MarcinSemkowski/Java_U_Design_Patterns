package Strategy.chef;

import Strategy.chef.egg_cooker.EggCookerStrategy;

public class Chef {

    private String name;
    private EggCookerStrategy eggCookerStrategy;

    public void cook(){
        this.eggCookerStrategy.cookEgg();
    }

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EggCookerStrategy getEggCookerStrategy() {
        return eggCookerStrategy;
    }

    public void setEggCookerStrategy(EggCookerStrategy eggCookerStrategy) {
        this.eggCookerStrategy = eggCookerStrategy;
    }
}
