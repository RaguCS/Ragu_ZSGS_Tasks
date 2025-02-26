package Daily_Challenge;

public class Day_8 {
    public boolean isFascinating(int n) {
        int[] visi=new int[10];
        visi[0]=-1;
        return isFasi(visi,n)&&isFasi(visi,2*n)&&isFasi(visi,3*n);
    }
    public boolean isFasi(int[] visi,int n){
        int a=n;
        while(a!=0){
            int r=a%10;
            if(r!=0&&visi[r]==0){
                visi[r]=1;
            }else{
                return false;
            }
            a/=10;
        }
        return true;
    }
}
