package Task_2;

public class Program_20_to_23 {
    public static void main(String[] args) {
        Program_20_to_23 p=new Program_20_to_23();
        p.pattern4(9);
    }
    public void pattern1(int n){
        for(int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>0;j--)
                System.out.print(j+" ");
            System.out.println();

        }
    }
    public void pattern2(int n){
        for(int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print("  ");
            }
            for (int j=(n-i)+1;j<=n;j++){
                System.out.print(j+" ");
            }
            for(int j=n-1;j>=(n-i)+1;j--)
                System.out.print(j+" ");
            System.out.println();

        }
    }
    public void pattern3(int n){
        for(int i=1;i<=n;i++){
            for (int j=n-i;j<n;j++){
                System.out.print("  ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("*   ");
            }
            System.out.println();

        }
    }
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for (int j=n-i;j<n;j++){
                System.out.print("  ");
            }
            for (int j=i;j<=n;j++){
                System.out.print(((n-i)+1)+"   ");
            }
            System.out.println();

        }
    }
}
