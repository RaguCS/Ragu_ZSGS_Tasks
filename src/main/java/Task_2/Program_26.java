package Task_2;

public class Program_26 {
    public static void main(String[] args) {
        Program_26 p = new Program_26();
        p.pattern(8);
    }
    public void pattern(int n){
         for(int i=1;i<=n;i++){
             for(int j=n;j>=i;j--){
                System.out.print("*");
                }
             for (int j=1;j<i;j++) {
                 System.out.print("_");
             }
             for (int j=1;j<i;j++) {
                 System.out.print("_");
             }
             for(int j=n;j>=i;j--){
                 System.out.print("*");
             }
             System.out.println();
        }
         for(int i=2;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             for (int j=i;j<=n-1;j++) {
                 System.out.print("_");
             }
             for (int j=i;j<=n-1;j++) {
                 System.out.print("_");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
