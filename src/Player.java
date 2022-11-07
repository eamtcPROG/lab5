public class Player extends Human{
    public int position;
    public int technique;
    public int stamina;
    public int speed;

    public float createPlayerRating(int t,int st, int s){
        this.technique = t;
        this.stamina = st;
        this.speed =s;
        float rating = (this.technique +this.stamina + this.speed)/3;
        return rating;
    }
    public void createPlayer(String n,String s,int a,int p,int t,int st, int ss){
        this.name = n;
        this.surname = s;
        this.age = a;
        this.position = p;
        this.rating = createPlayerRating(t,st,ss);
        if(this.position == 1){
            if(this.technique > 6){
                this.rating = this.rating + 1;
            }
            else {
                this.rating = this.rating - 1;
            }
        }
        if(this.position < 5 && this.position > 1){
            if(this.stamina > 6){
                this.rating = this.rating + 1;
            }
            else {
                this.rating = this.rating - 1;
            }
        }
        if(this.position < 5 && this.position > 1){
            if(this.stamina > 6){
                this.rating = this.rating + 1;
            }
            else {
                this.rating = this.rating - 1;
            }
        }
        if(this.position < 12 && this.position > 8){
            if(this.speed > 6){
                this.rating = this.rating + 1;
            }
            else {
                this.rating = this.rating - 1;
            }
        }
        if(this.age < 27 && this.age > 22){
            this.rating = this.rating + 1;
        }
        if(this.age < 40 && this.age > 36){
            this.rating = this.rating - 2;
        }
    }
}
