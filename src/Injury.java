import java.util.Random;

public class Injury {
    public int chance;
    public int injury;
    public void createInjury(int c){
        this.chance = c;
        Random r = new Random();
        int ran = r.nextInt(this.chance);
        this.injury = ran;
    }
}
