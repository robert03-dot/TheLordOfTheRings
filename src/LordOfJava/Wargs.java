package LordOfJava;

public class Wargs extends Creature implements IBite{
    private double bitePower;
    public Wargs(Abilities abilities, String nickname, long score, double stamina, double speed, int agility,double bitePower) {
        super(abilities, nickname, score, stamina, speed, agility);
        this.bitePower = bitePower;
    }

    @Override
    public void powerUp(double stamina, double speed, int agility) {
        super.powerUp(stamina/2,speed*4,agility);
    }
    @Override
    public double getBitePower() {
        return this.bitePower;
    }

    @Override
    public String toString() {
        return super.toString() + "bite power:" + this.bitePower;
    }
}
