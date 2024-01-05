package LordOfJava;

public class Parameters {
    private String OS;
    private String gamePATH;
    private String credentials;
    private int noLives;

    public Parameters(String OS,String gamePATH,String credentials,int noLives){
        this.OS = OS;
        this.gamePATH = gamePATH;
        this.credentials = credentials;
        this.noLives = noLives;
    }

    @Override
    public String toString() {
        return  "OS:'" + OS + "\n'" +
                ", Game Path:'" + gamePATH + "\n'" +
                ", Credentials:'" + credentials + "\n'" +
                ", No.lives remaining:" + noLives;
    }

}
