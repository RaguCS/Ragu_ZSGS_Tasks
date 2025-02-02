package Task_1;

public class Logic_2 {
    public boolean makeBricks(int small, int big, int goal) {
        return (goal%5<=small&&5*big>=(goal-small));
    }
    public int loneSum(int a, int b, int c) {
        return a==b&&b==c?0:a==b?c:c==b?a:a==c?b:a+b+c;
    }
    public int luckySum(int a, int b, int c) {
        return a==13?0:b==13?a:c==13?a+b:a+b+c;
    }
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }
    public int fixTeen(int n){
        return n==15?15:n==16?16:n>12&&n<20?0:n;
    }
    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }
    public int round10(int num){
        return (num%10)<5?num-(num%10):num+(10-(num%10));
    }
    public boolean closeFar(int a, int b, int c) {
        return Math.abs(a-b)<=1&&Math.abs(a-c)>=2&&Math.abs(b-c)>=2
                ||Math.abs(a-c)<=1&&Math.abs(a-b)>=2&&Math.abs(b-c)>=2;
    }
    public int blackjack(int a, int b) {
        return (a>21&&b>21)?0:(a>21)?b:b>21?a:(21-a)<(21-b)?a:b;
    }
    public boolean evenlySpaced(int a, int b, int c) {
        if(a==b&&b==c)return true;
        else if(a==b||b==c||c==a)
            return false;
        else
            return Math.abs(a-b)==Math.abs(b-c)||Math.abs(b-c)==Math.abs(a-c)||Math.abs(a-c)==Math.abs(b-a);
    }
    public int makeChocolate(int small, int big, int goal) {
        int mul=big*5;
        if(goal>(mul+small))
            return -1;
        else
            return goal>mul?small>=goal-mul?goal-mul:-1:goal%5<=small?goal%5:-1;
    }

}
