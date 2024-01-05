package LordOfJava;

public class Dragons extends Creature implements IBurn{
    private double flamesPower;
    private int flySpeed;
    public Dragons(Abilities abilities, String nickname, long score, double stamina, double speed, int agility,double flamesPower, int flySpeed) {
        super(abilities, nickname, score, stamina, speed, agility);
        this.flamesPower = flamesPower;
        this.flySpeed = flySpeed;
    }

    @Override
    public double getFlamesPower() {
        return 0;
    }

    @Override
    public int getFlyingSpeed() {
        return 0;
    }

    @Override
    public void powerUp(double stamina, double speed, int agility) {
        super.powerUp(stamina*2,speed/2,agility*3);
    }

    @Override
    public String toString() {
        return super.toString() + ",\nflames:"+this.flamesPower+"\n,fly speed:" + this.flySpeed;
    }
}

