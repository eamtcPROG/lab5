public class Team extends Injury{
    public String name;
    public float rating;

    public void createTeam(String name,int stats[],int age[]){
        this.name= name;
        Coach c = new Coach();
        c.createCoach("Coach","Coach",age[11],stats[34]);
        Player p1 = new Player();
        p1.createPlayer("Player","1",age[0],1,stats[0],stats[1],stats[3]);
        Player p2 = new Player();
        p2.createPlayer("Player","2",age[1],2,stats[4],stats[5],stats[6]);
        Player p3 = new Player();
        p3.createPlayer("Player","3",age[2],3,stats[7],stats[8],stats[9]);
        Player p4 = new Player();
        p4.createPlayer("Player","4",age[3],4,stats[10],stats[11],stats[12]);
        Player p5 = new Player();
        p5.createPlayer("Player","5",age[4],5,stats[13],stats[14],stats[15]);
        Player p6 = new Player();
        p6.createPlayer("Player","6",age[5],6,stats[16],stats[17],stats[18]);
        Player p7 = new Player();
        p7.createPlayer("Player","7",age[6],7,stats[19],stats[20],stats[21]);
        Player p8 = new Player();
        p8.createPlayer("Player","8",age[7],8,stats[22],stats[23],stats[24]);
        Player p9 = new Player();
        p9.createPlayer("Player","9",age[8],9,stats[25],stats[26],stats[27]);
        Player p10 = new Player();
        p10.createPlayer("Player","10",age[9],10,stats[28],stats[29],stats[30]);
        Player p11 = new Player();
        p11.createPlayer("Player","11",age[10],11,stats[31],stats[32],stats[33]);
        this.rating = (p1.rating+p2.rating+p3.rating+p4.rating+p5.rating+p6.rating+p7.rating+
                p8.rating+p9.rating+p10.rating+p11.rating)/11;
        createInjury(10);
        if(this.injury == 8){
            System.out.println("-------");
            System.out.println("Injury in "+this.name);
            System.out.println("-------");
            this.rating = this.rating - 10;
        }
        if (c.rating >6){
            this.rating = this.rating +1;
        }
        else {
            this.rating = this.rating +1;
        }
    }

}
