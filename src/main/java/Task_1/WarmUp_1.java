package Task_1;

public class WarmUp_1 {
    public boolean sleepIn(boolean wday, boolean vca) {
        if(!wday||vca)
            return true;
        else
            return false;
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile&&bSmile||!aSmile&&!bSmile)
            return true;
        else
            return false;
    }
    public int sumDouble(int a, int b) {
        if(a==b)
            return (a+b)*2;
        else
            return a+b;
    }
    public int diff21(int n) {
        if(n>21)
            return Math.abs(21-n)*2;
        else
            return Math.abs(21-n);
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking&&hour<7||talking&&hour>20)
            return true;
        else
            return false;
    }
    public boolean makes10(int a, int b) {
        if(a==10||b==10||a+b==10)
            return true;
        else
            return false;
    }
    public boolean nearHundred(int n) {
        if(n-90>=0&&n-90<=20||n-190>=0&&n-190<=20)
            return true;
        else
            return false;
    }
}
