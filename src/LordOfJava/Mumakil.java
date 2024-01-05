package LordOfJava;

public class Mumakil extends Creature{
    public Mumakil(Abilities abilities, String nickname, long score, double stamina, double speed, int agility) {
        super(abilities, nickname, score, stamina, speed, agility);
    }

    @Override
    public void powerUp(double stamina, double speed, int agility) {
        super.powerUp(0.75 * stamina, 10 + speed, agility);
    }

    @Override
    public String toString() {
        return super.toString() + "\nA creature of type Mumakil";
    }
}
