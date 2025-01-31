package Task_1;

public class Logic_1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(!isWeekend&&cigars>=40&&cigars<=60)return true;
        else
            return isWeekend && cigars >= 40;
    }

}
