import java.util.Arrays;

public class Ranking {
    public int points;
    public int winnerId;
   public void calcTop(int arr[]){
       this.points = Arrays.stream(arr).max().getAsInt();
       for (int i =0;i<arr.length;i++){
           if(arr[i] == points){
               this.winnerId=i;
           }
       }
   }
   public int calcGamePoints(int arr[]){
       int p;
       p = Arrays.stream(arr).sum();
       return p;
   }
}
