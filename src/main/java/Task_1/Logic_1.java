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
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer&&temp<=100&&temp>=60)return true;
        else
            return temp>=60&&temp<=90;
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        speed=speed-(isBirthday?5:0);
        return speed>80?2:speed>60?1:0;
    }
    public int sortaSum(int a, int b) {
        return a+b>19?a+b:a+b>9?20:a+b;
    }
    public String alarmClock(int day, boolean vacation) {
        String s1="7:00",s2="10:00";
        if(vacation)return day>0&&day<6?s2:"off";
        else return day>0&&day<6?s1:s2;
    }
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }
    public boolean in1To10(int n, boolean outsideMode) {
        return !outsideMode && n >= 1 && n <= 10 || (outsideMode && (n <= 1 || n >= 10));
    }
    public boolean specialEleven(int n) {
        return n%11==0||n%11==1;
    }
    public boolean more20(int n) {
        return n%20==1||n%20==2;
    }
    public boolean old35(int n) {
        return ((n % 3 != 0) || (n % 5 != 0)) && ((n % 3 == 0) || (n % 5 == 0));
    }
    public boolean less20(int n) {
        return n%20==18||n%20==19;
    }
    public boolean nearTen(int num) {
        return num%10<=2||(10-(num%10)<=2);
    }
    public int teenSum(int a, int b) {
        return a>12&&a<20||b>12&&b<20?19:a+b;
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isAsleep&&!isMom&&!isMorning)||!isAsleep&&isMom;
    }
    public int teaParty(int tea, int candy) {
        return tea>4&&candy>4&&((tea*2)<=candy||(candy*2)<=tea)?2:tea>4&&candy>4?1:0;
    }
    public String fizzString(String str) {
        if(str.startsWith("f")&&str.endsWith("b"))return "FizzBuzz";
        else
            return str.startsWith("f")?"Fizz":str.endsWith("b")?"Buzz":str;
    }
    public String fizzString2(int n) {
        if(n%3==0&&n%5==0)return  "FizzBuzz!";
        else if(n%3==0) return "Fizz!";
        else return n%5==0?"Buzz!": n+"!";
    }
    public boolean twoAsOne(int a, int b, int c) {
        return a+b==c||b+c==a||c+a==b;
    }
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(!bOk)
            return b>a&&c>b;
        else
            return c>b;
    }
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk)return a<=b&&b<=c;
        else return a<b&&b<c;
    }
    public boolean lastDigit(int a, int b, int c) {
        a%=10;
        b%=10;
        c%=10;
        return a==b||a==c||b==c;
    }
    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a-b)>=10||Math.abs(a-c)>=10||Math.abs(c-b)>=10;
    }
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles&&die1==die2)return die1==6?die1+1:die1+die2+1;
        else return die1+die2;
    }
    public int maxMod5(int a, int b) {
        return a==b?0:a%5==b%5?Math.min(a,b):Math.max(a,b);
    }
    public int redTicket(int a, int b, int c) {
        if(a==b&&b==c&&c==a)return c==2?10:5;
        else return b!=a&&c!=a?1:0;
    }
    public int greenTicket(int a, int b, int c) {
        if(a==b||b==c||c==a)return a==b&&b==c&&c==a?20:10;
        else return 0;

    }
    public int blueTicket(int a, int b, int c) {
        int ab=a+b,bc=b+c,ac=a+c;
        if(ab==10||bc==10||ac==10)
            return 10;
        else if((ab-10)==bc||(ab-10)==ac)
            return 5;
        else return 0;
    }
    public boolean shareDigit(int a, int b) {
        int da=a/10,db=b/10,ma=a%10,mb=b%10;
        return da==db||ma==mb||da==mb||ma==db;
    }
    public int sumLimit(int a, int b) {
        String s=String.valueOf(a+b);
        String as=String.valueOf(a);
        if(s.length()==as.length())return a+b;

        return a;
    }




}
