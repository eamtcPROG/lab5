public class Game extends Stadium{
    public int win;
    public  void stadiumGame(String t){
        this.stadiumType = t;
    }

    public void play(Team t1,Team t2,String stadium){
        stadiumGame(stadium);
        if(this.stadiumType == "h") t1.rating = t1.rating + 1;
//        System.out.println("Game");
//        System.out.println("-------");
//        System.out.println(t1.rating);
//        System.out.println(t2.rating);
//        System.out.println("-------");
        if(t1.rating > t2.rating){
            this.win = 3;
        } else if (t1.rating == t2.rating) {
            this.win = 1;
        }
        else {
            this.win = 0;
        }
    }
}
