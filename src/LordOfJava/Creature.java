package LordOfJava;

public abstract class Creature implements Comparable<Creature>{
    private Abilities abilities;
    private String nickname;
    private long score;
    public Creature(Abilities abilities,String nickname,long score,double stamina,double speed,int agility){
        this.abilities = abilities;
        this.nickname = nickname;
        this.score = score;
        this.abilities = new Abilities(stamina,speed,agility);
    }
    public void updateScore(long amount) throws NumberFormatException{
        if(amount<0) {
            throw new NumberFormatException("Expecting positive bonus value,got:" + amount);
        }
        score +=amount;
    }
    public void powerUp(double stamina,double speed,int agility){
        abilities.update(stamina,speed,agility);
    }
    public int compareTo(Creature other){
        return this.abilities.compareTo(other.abilities);
    }
    public String toString(){
        return "Nickname:" + nickname + "\n'" +
                "Score:'" + score + "\n'" +
                "Abilities'" + abilities + "\n'";
    }
}
