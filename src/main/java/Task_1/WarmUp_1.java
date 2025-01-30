package Task_1;

public class WarmUp_1 {
    public boolean sleepIn(boolean wday, boolean vca) {
        if(!wday||vca)
            return true;
        else
            return false;
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile&&bSmile||!aSmile&&!bSmile)
            return true;
        else
            return false;
    }
    public int sumDouble(int a, int b) {
        if(a==b)
            return (a+b)*2;
        else
            return a+b;
    }
    public int diff21(int n) {
        if(n>21)
            return Math.abs(21-n)*2;
        else
            return Math.abs(21-n);
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking&&hour<7||talking&&hour>20)
            return true;
        else
            return false;
    }
    public boolean makes10(int a, int b) {
        if(a==10||b==10||a+b==10)
            return true;
        else
            return false;
    }
    public boolean nearHundred(int n) {
        if(n-90>=0&&n-90<=20||n-190>=0&&n-190<=20)
            return true;
        else
            return false;
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative&&(a<0&&b<0)||((a>0&&b<0)||(a<0&&b>0))&&!negative)
            return true;
        else
            return false;
    }
    public String notString(String str) {
        if(!str.startsWith("not"))
            return "not "+str;
        else
            return str;
    }
    public String missingChar(String str, int n) {
        StringBuilder sb=new StringBuilder(str);
        sb.deleteCharAt(n);
        return sb.toString();
    }
    public String frontBack(String str) {
        if(str.length()<1)return str;
        StringBuilder sb=new StringBuilder(str);
        char c=sb.charAt(0);
        sb.setCharAt(0,sb.charAt(str.length()-1));
        sb.setCharAt(str.length()-1,c);
        return sb.toString();
    }
    public String front3(String str) {
        if(str.length()<3)
            return str+str+str;
        else{
            String s=str.substring(0,3);
            return s+s+s;
        }
    }
    public String backAround(String str) {
        char c=str.charAt(str.length()-1);
        return c+str+c;
    }
    public boolean or35(int n) {
        if(n%3==0||n%5==0)return true;
        else return false;
    }
    public String front22(String str) {
        if(!(str.length()<2)){
            String s=str.substring(0,2);
            return s+str+s;
        }
        else return str+str+str;
    }
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
    public boolean icyHot(int temp1, int temp2) {
        if((temp1<0||temp2<0)&&(temp1>100||temp2>100))return true;
        else return false;
    }
    public boolean in1020(int a, int b) {
        if(a<=20&&a>=10||b<=20&&b>=10)
            return true;
        else
            return false;
    }
    public boolean hasTeen(int a, int b, int c) {
        if(a>=13&&a<=19||b>=13&&b<=19||c>=13&&c<=19)return true;
        else return false;
    }
    public boolean loneTeen(int a, int b) {
        if(a>=13&&a<=19&&b>=13&&b<=19||a>19&&b>19)return false;
        else return true;
    }
    public String delDel(String str) {
        if(str.contains("del")&&str.charAt(1)=='d')
            return new StringBuilder(str).delete(1,4).toString();
        else
            return str;
    }
    public boolean mixStart(String str) {
        if(str.length()>2&&str.charAt(1)=='i'&&str.charAt(2)=='x')return true;
        else return false;
    }
    public String startOz(String str) {
        if(str.length()<2)return str.length()==1&&str.charAt(0)=='o'?"o":"";
        else
            return (str.charAt(0)=='o'?"o":"").concat(str.charAt(1)=='z'?"z":"");
    }
    public int intMax(int a, int b, int c) {
        return a>(b>c?b:c)?a:(b>c?b:c);
    }
    public int close10(int a, int b) {
        int c1=Math.abs(10-a);
        int c2=Math.abs(10-b);
        return c1<c2?a:c1>c2?b:0;
    }
    public boolean in3050(int a, int b) {
        if(a>=30&&a<=40&&b>=30&&b<=40||(a>=40&&a<=50&&b>=40&&b<=50))return true;
        else return false;

    }
    public int max1020(int a, int b) {
        return a<b?b>=10&&b<=20?b:a>=10&&a<=20?a:0:a>=10&&a<=20?a:b;
    }
    public boolean stringE(String str) {
        int len=str.length()-str.replaceAll("e","").length();
        return len>0&&len<=3?true:false;
    }
    public boolean lastDigit(int a, int b) {
        return Math.abs(a-b)%10==0;
    }
    public String endUp(String str) {
        int len=str.length();
        if(len>3)
            return str.substring(0,len-3)+str.substring(len-3,len).toUpperCase();
        else
            return str.toUpperCase();
    }
    public String everyNth(String str, int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i+=n){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
