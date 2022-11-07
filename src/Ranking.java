public class Ranking extends Game{
    public int points;
    public int calcPoints(Team t1, Team t2){
        play(t1, t2);
        if(this.win == 1){
            this.points = 3;
        } else if (this.win == 0) {
            this.points = 1;
        }
        else{
            this.points = 0;
        }
        return this.points;
    }
}
