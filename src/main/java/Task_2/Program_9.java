package Task_2;

public class Program_9 {
    public static void main(String[] args) {
        Program_9 p = new Program_9();
        System.out.println(p.reverseNumber(12345000));
    }
    public int reverseNumber(int n) {
        int res = 0;
        while (n != 0) {
            res=(res *10)+ n % 10;
            n /= 10;
        }
        return res;
    }
}
