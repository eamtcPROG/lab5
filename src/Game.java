public class Game extends Stadium{
    public int win;
    public void play(Team t1,Team t2){
        if(this.stadiumType == "h") t1.rating = t1.rating + 1;
        else t1.rating = t1.rating - 1;
        if(t1.rating < t2.rating){
            this.win = 1;
        } else if (t1.rating == t2.rating) {
            this.win = 0;
        }
        else {
            this.win = -1;
        }
    }
}
