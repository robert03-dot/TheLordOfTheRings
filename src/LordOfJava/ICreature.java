package LordOfJava;

public interface ICreature {
    String getNckname();
    void setNickname(String nickname);
    void updateScore(long amount) throws NumberFormatException;
    void powerUp(double stamina,double speed,int agility);
}
