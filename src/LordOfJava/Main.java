package LordOfJava;

public class Main {
    public static void main(String[] args) {
        Abilities abilities1 = new Abilities(100,100,100);
        Abilities abilities2 = new Abilities(200,200,200);
        Abilities abilities3 = new Abilities(300,300,300);
        Mumakil mumakil1 = new Mumakil(abilities1,"Grond",1000,10000,100,100);
        Mumakil mumakil2 = new Mumakil(abilities2,"Boldog",1000,10000,100,100);
        Mumakil mumakil3 = new Mumakil(abilities3,"Bane",2000,3000,300,400);
        Wargs wargs1 = new Wargs(abilities1,"Matriarch",3000,200,90,90,100);
        Wargs wargs2 = new Wargs(abilities2,"Matriarch",3000,200,90,90,100);
        Wargs wargs3 = new Wargs(abilities3,"Matriarch",3000,200,90,90,100);
        Dragons dragons1 = new Dragons(abilities1,"Ancalagon",3000,5000,1000,500);
        Dragons dragons2 = new Dragons(abilities2,"Smaug",900000,300000,2000000,200);
        Dragons dragons3 = new Dragons(abilities3,"Glaurung",3000000,5000000,100000,500);
    }
}
