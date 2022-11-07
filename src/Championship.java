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
        int[] statsTeam1 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,9,4,6,7,4,5,10,2,7,8,9,7,6,4,6,7,4,5,10,2,7,8,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5 };
        t1.createTeam("Team1",statsTeam1,ageTeam1);
        Team t2 = new Team();
        int[] ageTeam2 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam2 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,8,4,6,7,4,5,10,2,7,8,9,7,6,4,6,7,4,5,10,2,7,8,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5 };
        t2.createTeam("Team2",statsTeam2,ageTeam2);
        Team t3 = new Team();
        int[] ageTeam3 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam3 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,3,4,6,7,4,5,10,2,7,8,9,7,6,4,6,7,4,5,10,2,7,8,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t3.createTeam("Team3",statsTeam3,ageTeam3);
        Team t4 = new Team();
        int[] ageTeam4 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam4 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,6,4,6,7,4,5,10,2,7,8,9,7,6,4,4,7,4,5,10,2,7,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t4.createTeam("Team4",statsTeam4,ageTeam4);
        Team t5 = new Team();
        int[] ageTeam5 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam5 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,6,4,6,7,4,5,10,2,7,8,9,7,6,4,10,7,4,5,10,2,7,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t5.createTeam("Team5",statsTeam5,ageTeam5);
        Team t6 = new Team();
        int[] ageTeam6 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam6 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,6,4,6,7,4,5,10,2,7,8,9,7,6,2,6,7,4,5,10,2,7,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t6.createTeam("Team6",statsTeam6,ageTeam6);
        Team t7 = new Team();
        int[] ageTeam7 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam7 = new int[]{ 4,6,7,4,5,10,2,7,8,9,7,6,4,6,7,4,5,10,2,7,8,9,7,6,5,6,7,4,5,10,2,7,8,9 ,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        t7.createTeam("Team7",statsTeam7,ageTeam7);
        Team t8 = new Team();
        int[] ageTeam8 = new int[]{ 24,34,19,30,24,26,25,22,39,29,49,40,40,40,40 };
        int[] statsTeam8 = new int[]{ 10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,8,9,5,5,5,5,5,5,5 ,5,5,5,5,5,5,5};
        t8.createTeam("Team8",statsTeam8,ageTeam8);
        t1Points= (int) t1.rating;
        t2Points= (int)t2.rating;
        t3Points= (int)t3.rating;
        t4Points= (int)t4.rating;
        t5Points=(int)t5.rating;
        t6Points= (int)t6.rating;
        t7Points= (int)t7.rating;
        t8Points=(int) t8.rating;
        int[] findWiner = new int[]{ t1Points,t2Points,t3Points,t4Points,t5Points,t6Points,t7Points,t8Points};
        this.pointsWinner = Arrays.stream(findWiner).max().getAsInt();

        for (int i =0;i<findWiner.length;i++){
            if(findWiner[i] == Arrays.stream(findWiner).max().getAsInt()){
                m=i;
            }
        }
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
