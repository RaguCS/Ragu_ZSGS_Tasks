package Task_2;

public class Program_6_and_7 {
    public static void main(String[] args) {
        int a=10,b=20;
        int c=++a+b--;
        int d=a%b++;
         a+=b+5;
        int f=69>>>5;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        //program 7
        a=28;
        a+=a++ + ++a + --a +a--;
        System.out.println(a);
    }
}
