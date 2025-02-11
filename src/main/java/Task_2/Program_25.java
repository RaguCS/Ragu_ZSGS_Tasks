package Task_2;

public class Program_25 {
    public static void main(String[] args) {
        Program_25 p = new Program_25();
        p.Xpattern("DhivyaR");
    }
    public void Xpattern(String x){
        int l=x.length();
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(i==j||(i+j)==l-1){
                    System.out.print(x.charAt(j));
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
