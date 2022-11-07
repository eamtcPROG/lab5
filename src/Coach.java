public class Coach extends Human{
    public int experince;
    public void createCoach(String n,String s,int a,int e){
        this.name = n;
        this.surname = s;
        this.age = a;
        this.experince = e;
        if(this.age > 45){
            this.experince = this.experince +1;
        }
    }
}
