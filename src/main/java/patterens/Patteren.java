package patterens;

public class Patteren {
    public static void main(String[] args) {
        Patteren p = new Patteren();
        p.patteren9(5);
    }
    public void patteren10(int n){

    }
    public void patteren9(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" *");
            }


            System.out.println();
        }
    }


    public void patteren8(int n) {
        for(int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void patteren7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
    public void patteren6(int n) {
        int k=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((k^=1) +" ");
            }
            System.out.println();
        }
    }
    public void patteren5(int n) {
        int k=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
    public void patteren4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void patteren3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public void patteren2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public void patteren1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
