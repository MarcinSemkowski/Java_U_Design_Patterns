package Factory.units;

public abstract  class AirUnit {
    private int hp;
    private int exp;
    private int dmgDone;


    protected AirUnit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getDmgDone() {
        return dmgDone;
    }

    public int getExp() {
        return exp;
    }

    public int getHp() {
        return hp;
    }
}
