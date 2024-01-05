package LordOfJava;
import java.util.*;
public class Cohort<C extends Creature> {
    private Map <String,C> my_map = new HashMap<>();
    public int size(){
        return my_map.size();
    }
    public C getCitizenAt(String address){
        return my_map.get(address);
    }
    public boolean isEmpty() {
        return my_map.isEmpty();
    }
    public void addNewCitizen(String address,C creature){
        my_map.put(address,creature);
    }
    public ArrayList<C> getAllCitizensToFight(){
       ArrayList<C> list = new ArrayList<>();
        Collections.sort(list);
        return list;
    }

    @Override
    public String toString() {
        ArrayList<C> list = new ArrayList<>();
        String result = "";
        for(C lists:list){
            result = result+lists+"\n";
        }
        return result;
    }
}
