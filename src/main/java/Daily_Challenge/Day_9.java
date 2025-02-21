package Daily_Challenge;

public class Day_9 {
    public int maxProfit(int[] p) {
        int maxProfit=0,min=p[0];
        for(int i=1;i<p.length;i++){
            int val=p[i]-min;
            maxProfit=Math.max(maxProfit,val);
            min=Math.min(min,p[i]);
        }
        return maxProfit;
    }
}
