package Flyweight;

public class Rifleman {

    private int x;
    private int y;
    private int  hpLeft;
    private DestroyerUnitStats stats;


    public Rifleman( int x, int y) {
        stats = UnitStatsRepository.getDestroyerStats();
        this.x = x;
        this.y =y;

        this.hpLeft =  stats.getHp();

    }




}
