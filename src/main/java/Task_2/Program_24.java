package Task_2;

public class Program_24 {
    public static void main(String[] args) {
        Program_24 p = new Program_24();
        p.pattern(4);
    }
    public void pattern(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
