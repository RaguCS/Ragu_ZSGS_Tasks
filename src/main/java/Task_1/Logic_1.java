package Task_1;

public class Logic_1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(!isWeekend&&cigars>=40&&cigars<=60)return true;
        else
            return isWeekend && cigars >= 40;
    }
    public int dateFashion(int you, int date) {
        if((you>7&&date>2)||(date>7&you>2))return 2;
        else
            return you < 3 || date < 3 ?0:1;
    }


}
