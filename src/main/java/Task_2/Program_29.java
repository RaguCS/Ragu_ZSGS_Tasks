package Task_2;

public class Program_29 {
    public static void main(String[] args) {
        Program_29 p=new Program_29();
        p.printC(8);
    }
    public void printC(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==0||i==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
