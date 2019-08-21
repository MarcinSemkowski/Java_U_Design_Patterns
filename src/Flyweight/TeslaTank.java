package Flyweight;

public class TeslaTank {


    private int x;
    private int y;
    private int  hpLeft;
    private DestroyerUnitStats stats;


    public TeslaTank( int x, int y) {
        stats = UnitStatsRepository.getDestroyerStats();
        this.x = x;
        this.y =y;

        this.hpLeft =  stats.getHp();

    }
}
