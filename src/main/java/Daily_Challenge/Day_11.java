package Daily_Challenge;

public class Day_11 {
    public String losingPlayer(int x, int y) {
        int p=1;
        while (x>=1 && y>=4){
            x-=1;y-=4;
            p=p^1;
        }
        if(p==0)
            return "Alice";
        else
            return "Bob";
    }
}
