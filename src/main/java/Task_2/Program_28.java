package Task_2;

public class Program_28 {
    public static void main(String[] args) {
    Program_28 p=new Program_28();
        System.out.println(p.sumSeries(5));
    }
    public int sumSeries(int n){
        int sum=0,res=0;
        for (int i=0;i<n;i++){
            sum=sum*10+1;
            res+=sum;
        }
        return res;
    }
}
