package Task_2;

public class Program_5 {
    public static void main(String[] args) {

    }
    public boolean apply(double x,double a,double b,double c){
        return (a*(x*x))+(b*x)+c==0;
    }
    public double evaluate(double a, double b, double c){
        double k=Math.pow(b,2)-(4*a*c);
        if(k<0){
            double root1 = (-b+Math.sqrt(k))/(2*a);
            double root2 = (-b-Math.sqrt(k))/(2*a);
            return root1+root2;
        }else if(k==0){
            double root1 = (-b/(2*a));
            return root1;
        }else {
            double root1 = (-b/(2*a));
            double root2 = (Math.sqrt(k)/(2*a));
            return root1+root2;
        }
    }
}
