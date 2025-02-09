package Task_2;

import java.text.DecimalFormat;

public class Program_4 {
    public static void main(String[] args) {
        double d=7.5;
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println(df.format(d));
        System.out.printf("%.2f", d);
    }
}
