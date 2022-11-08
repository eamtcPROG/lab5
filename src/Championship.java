import java.util.Arrays;

public class Championship extends Ranking{
    public int pointsWinner;
    public String winner;
    public int m;
    public int t1Points;
    public int t2Points;
    public int t3Points;
    public int t4Points;
    public int t5Points;
    public int t6Points;
    public int t7Points;
    public int t8Points;
    public void playChampionship(){
        Team t1 = new Team();
        int[] ageTeam1 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam1 = new int[]{ 40,60,70,40,50,10,20,70,80,90,70,90,40,60,70,40,50,10,20,70,80,9,70,6,4,6,7,4,5,10,2,7,8,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5 };
        t1.createTeam("Team1",statsTeam1,ageTeam1);
        Team t2 = new Team();
        int[] ageTeam2 = new int[]{ 24,28,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam2 = new int[]{ 4,6,70,4,5,10,20,7,8,9,70,8,4,60,7,4,5,100,20,70,80,9,7,6,4,60,70,4,5,10,2,7,8,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5 };
        t2.createTeam("Team2",statsTeam2,ageTeam2);
        Team t3 = new Team();
        int[] ageTeam3 = new int[]{ 24,11,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam3 = new int[]{ 4,6,70,40,5,10,20,7,8,9,70,30,40,60,70,40,50,100,20,70,80,9,7,6,40,60,7,4,5,10,2,7,8,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t3.createTeam("Team3",statsTeam3,ageTeam3);
        Team t4 = new Team();
        int[] ageTeam4 = new int[]{ 24,44,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam4 = new int[]{ 4,6,7,4,5,10,2,70,80,90,70,60,4,60,7,4,50,10,2,7,8,90,7,6,40,40,7,4,5,10,2,70,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t4.createTeam("Team4",statsTeam4,ageTeam4);
        Team t5 = new Team();
        int[] ageTeam5 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam5 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,6,4,60,7,40,50,100,20,70,80,90,70,60,40,10,7,4,5,10,2,7,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t5.createTeam("Team5",statsTeam5,ageTeam5);
        Team t6 = new Team();
        int[] ageTeam6 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam6 = new int[]{ 4,6,70,40,50,100,20,70,80,90,7,6,40,60,70,40,50,100,2,7,80,9,7,6,2,6,7,4,5,10,2,7,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t6.createTeam("Team6",statsTeam6,ageTeam6);
        Team t7 = new Team();
        int[] ageTeam7 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam7 = new int[]{ 4,6,7,40,50,100,20,70,80,90,70,60,40,60,70,40,50,100,2,70,80,9,7,6,5,6,7,4,5,10,2,7,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t7.createTeam("Team7",statsTeam7,ageTeam7);
        Team t8 = new Team();
        int[] ageTeam8 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam8 = new int[]{ 1,1,10,1,1,1,1,1,1,1,10,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,9,5,5,5,5,5,5,5 ,5,5,5,5,5,5,5};
        t8.createTeam("Team8",statsTeam8,ageTeam8);
        Game g1 = new Game();
        Game g2 = new Game();
        Game g3 = new Game();
        Game g4 = new Game();
        Game g5 = new Game();
        Game g6 = new Game();
        Game g7 = new Game();
        g1.play(t1,t2,"h");

        g2.play(t1,t3,"h");
        g3.play(t1,t4,"a");
        g4.play(t1,t5,"a");
        g5.play(t1,t6,"a");
        g6.play(t1,t7,"a");
        g7.play(t1,t8,"a");

        int[] gameTeam1 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        g1.play(t2,t1,"h");

        g2.play(t2,t4,"h");
        g3.play(t2,t3,"a");
        g4.play(t2,t5,"a");
        g5.play(t2,t6,"a");
        g6.play(t2,t7,"a");
        g7.play(t2,t8,"a");
        int[] gameTeam2 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        g1.play(t3,t1,"h");

        g2.play(t3,t2,"h");
        g3.play(t3,t4,"a");
        g4.play(t3,t5,"a");
        g5.play(t3,t6,"a");
        g6.play(t3,t7,"a");
        g7.play(t3,t8,"a");
        int[] gameTeam3 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        g1.play(t4,t1,"h");

        g2.play(t4,t2,"h");
        g3.play(t4,t3,"a");
        g4.play(t4,t5,"a");
        g5.play(t4,t6,"a");
        g6.play(t4,t7,"a");
        g7.play(t4,t8,"a");
        int[] gameTeam4 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        g1.play(t5,t1,"h");

        g2.play(t5,t2,"h");
        g3.play(t5,t3,"a");
        g4.play(t5,t4,"a");
        g5.play(t5,t6,"a");
        g6.play(t5,t7,"a");
        g7.play(t5,t8,"a");
        int[] gameTeam5 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        g1.play(t6,t1,"h");

        g2.play(t6,t2,"h");
        g3.play(t6,t3,"a");
        g4.play(t6,t5,"a");
        g5.play(t6,t4,"a");
        g6.play(t6,t7,"a");
        g7.play(t6,t8,"a");
        int[] gameTeam6 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        g1.play(t7,t1,"h");

        g2.play(t7,t2,"h");
        g3.play(t7,t3,"a");
        g4.play(t7,t5,"a");
        g5.play(t7,t6,"a");
        g6.play(t7,t4,"a");
        g7.play(t7,t8,"a");
        int[] gameTeam7 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        g1.play(t8,t1,"h");

        g2.play(t8,t2,"h");
        g3.play(t8,t3,"a");
        g4.play(t8,t5,"a");
        g5.play(t8,t6,"a");
        g6.play(t8,t7,"a");
        g7.play(t8,t4,"a");
        int[] gameTeam8 = new int[]{ g1.win, g2.win, g3.win,g4.win, g5.win, g6.win,g7.win};
        System.out.println("----------");
        System.out.println("Team Points");
        System.out.println(calcGamePoints(gameTeam1));
        System.out.println(calcGamePoints(gameTeam2));
        System.out.println(calcGamePoints(gameTeam3));
        System.out.println(calcGamePoints(gameTeam4));
        System.out.println(calcGamePoints(gameTeam5));
        System.out.println(calcGamePoints(gameTeam6));
        System.out.println(calcGamePoints(gameTeam7));
        System.out.println(calcGamePoints(gameTeam8));
        System.out.println("----------");
        System.out.println("Team ratings");
        System.out.println(t1.rating);
        System.out.println(t2.rating);
        System.out.println(t3.rating);
        System.out.println(t4.rating);
        System.out.println(t5.rating);
        System.out.println(t6.rating);
        System.out.println(t7.rating);
        System.out.println(t8.rating);
        System.out.println("----------");
        t1Points = calcGamePoints(gameTeam1);
        t2Points = calcGamePoints(gameTeam2);
        t3Points = calcGamePoints(gameTeam3);
        t4Points = calcGamePoints(gameTeam4);
        t5Points = calcGamePoints(gameTeam5);
        t6Points = calcGamePoints(gameTeam6);
        t7Points = calcGamePoints(gameTeam7);
        t8Points = calcGamePoints(gameTeam8);

        int[] findWiner = new int[]{ t1Points,t2Points,t3Points,t4Points,t5Points,t6Points,t7Points,t8Points};

        calcTop(findWiner);
        pointsWinner = this.points;
        m = this.winnerId;


        switch (m){
            case 0:{
                this.winner = t1.name;
                break;
            }
            case 1:{
                this.winner=t2.name;
                break;
            }
            case 2:{
                this.winner=t3.name;
                break;
            }
            case 3:{
                this.winner=t4.name;
                break;
            }
            case 4:{
                this.winner=t5.name;
                break;
            }
            case 5:{
                this.winner=t6.name;
                break;
            }
            case 6:{
                this.winner=t7.name;
                break;
            }
            case 7:{
                this.winner=t8.name;
                break;
            }

        }
    }
}
