package LordOfJava;

public class Abilities implements Comparable<Abilities>{
    private double stamina;
    private double speed;
    private int agility;
    public Abilities(double stamina, double speed, int agility){
        this.stamina = this.stamina;
        this.speed = this.speed;
        this.agility = this.agility;
    }

    @Override
    public int compareTo(Abilities other) {
        if(this.stamina < other.stamina){
            return -1;
        }
        if(this.stamina > other.stamina){
            return 1;
        }
        if(this.speed < other.speed){
            return -1;
        }
        if(this.speed > other.speed){
            return 1;
        }
        if(this.agility < other.agility){
            return -1;
        }
        if(this.agility > other.agility){
            return 1;
        }
        return 0;
    }
    public void update(double stamina, double speed,int agility){
        this.stamina+=stamina;
        this.agility+=agility;
        this.speed+=speed;
    }
    public int powerDifferenceApprox(Abilities other){
        return (int) Math.abs(this.stamina-other.stamina);
    }
    public String toString(){
        return "Player has a power of:" + stamina + ", the speed:" + speed + ", and the agility:" + agility;
    }

}