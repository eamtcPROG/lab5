public class Main {
    public static void main(String[] args) {

        Championship c = new Championship();
        while (true){
            c.playChampionship();
            System.out.println("--------------");
            System.out.println("Points: " + c.pointsWinner);
            System.out.println("Winner: " + c.winner);
            System.out.println("--------------");
        }
    }
}