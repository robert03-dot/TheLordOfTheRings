package LordOfJava;

import java.util.ArrayList;

public class LordOfJava {
    private Parameters parameters;
    private Cohort<Dragons> dragons;
    private Cohort<Wargs> wargs;
    private Cohort<Mumakil> mumakil;

    public LordOfJava(String OS,String gamePath,String credentials,int noLives) {
        this.parameters = new Parameters(OS,gamePath,credentials,noLives);
    }
    public void addCreature(Creature creature,String address) throws IllegalAccessException {
        if (creature instanceof Dragons) {
            dragons.addNewCitizen(address, (Dragons) creature);
        } else if (creature instanceof Wargs) {
            wargs.addNewCitizen(address, (Wargs) creature);
        } else if (creature instanceof Mumakil) {
            mumakil.addNewCitizen(address, (Mumakil) creature);
        } else {
            throw new IllegalAccessException("Creature type unknown:" + creature.getClass().getName());
        }
    }
    public int battleDragonsWargs() {
        if (dragons.size() < wargs.size()) {
            return -1;
        } else if (dragons.size() > wargs.size()) {
            return 1;
        }
        ArrayList<Dragons> dragons2 = dragons.getAllCitizensToFight();
        ArrayList<Wargs> wargs2 = wargs.getAllCitizensToFight();
        int score = 0;
        for(int i=0;i<wargs2.size();i++){
            int result = dragons2.get(i).compareTo(wargs2.get(i));
            score+=result > 0 ? 1 : result < 0 ? -1 : 0;
        }
        return score;
    }

    @Override
    public String toString() {
        return "\nParameters:" + parameters + ",\ndragons:" + dragons + "wargs:" + wargs + "mumakil:" + mumakil;
    }
}
