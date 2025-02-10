package Task_1;

public class String_1 {
    public String helloName(String name) {
        return "Hello "+name+"!";
    }
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2,out.length());
    }
    public String extraEnd(String str) {
        String s=str.substring(str.length()-2,str.length());
        return s+s+s;
    }
    public String firstTwo(String str) {
        if(str.length()<=2)return str;
        else
            return str.substring(0,2);
    }
    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
    public String comboString(String a, String b) {
        if(a.length()<b.length())return a+b+a;
        else
            return b+a+b;
    }
    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }
    public String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }
    public String right2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }
    public String theEnd(String str, boolean front) {
        return ""+(front?str.charAt(0):str.charAt(str.length()-1));
    }
    public String withouEnd2(String str) {
        return str.length()>=2?str.substring(1,str.length()-1):"";
    }
    public String middleTwo(String str) {
        int mid=str.length()/2;
        return ""+str.charAt(mid-1)+str.charAt(mid);
    }
    public boolean endsLy(String str) {
        int len=str.length();
        return len<2?false:str.charAt(len-2)=='l'&&str.charAt(len-1)=='y';
    }
    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n,str.length());
    }
    public String twoChar(String str, int index) {
        int len=str.length();
        return index>=len-1||index<0?str.substring(0,2):str.substring(index,index+2);
    }
    public String middleThree(String str) {
        int mid=str.length()/2;
        return ""+str.charAt(mid-1)+str.charAt(mid)+str.charAt(mid+1);
    }
    public boolean hasBad(String str) {
        int len=str.length();
        if(len<3)return false;
        return str.startsWith("bad") || str.substring(1).startsWith("bad");
    }
    public String atFirst(String str) {
        if(str.length()>=2)
            return str.substring(0,2);
        else
            return str.isEmpty() ?"@@":str+"@";
    }
    public String lastChars(String a, String b) {
        if(a.isEmpty()||b.isEmpty())
            return a.isEmpty()&&b.isEmpty()?"@@":a.isEmpty()?"@"+b.charAt(b.length()-1):a.charAt(0)+"@";
        else
            return ""+a.charAt(0)+b.charAt(b.length()-1);
    }
    public String conCat(String a, String b) {
        if(a.isEmpty()||b.isEmpty())return a+b;
        else
            return a.charAt(a.length()-1)==b.charAt(0)?a+b.substring(1):a+b;
    }
    public String lastTwo(String str) {
        int len=str.length();
        if(len<2)return str;
        else
            return str.substring(0,len-2)+str.charAt(len-1)+str.charAt(len-2);
    }
    public String seeColor(String str) {
        return str.startsWith("red")?"red":str.startsWith("blue")?"blue":"";
    }
    public boolean frontAgain(String str) {
        int len=str.length();
        if(len<4)return len >= 2;
        else
            return str.startsWith(str.substring(len-2,len));
    }
    public String minCat(String a, String b) {
        int alen=a.length(),blen=b.length();
        if(alen!=blen)
            return alen<blen?a+b.substring(blen-alen):a.substring(alen-blen,alen)+b;
        else
            return a+b;
    }
    public String extraFront(String str) {
        if(str.length()<2)return str+str+str;

        String s=str.substring(0,2);
        return s+s+s;
    }
    public String without2(String str) {
        int len=str.length();
        if(len<3)return len==2?"":str;
        else
            return str.charAt(0)==str.charAt(len-2)&&str.charAt(1)==str.charAt(len-1)?str.substring(2,len):str;
    }
    public String deFront(String str) {
        String s="";
        if(str.startsWith("ab"))
            return str;
        if(str.startsWith("a"))
            s+="a";
        if(str.length()>=2){
            s+=str.charAt(1)=='b'?"b":"";
            s+=str.substring(2);
        }
        return s;
    }
    public String withoutX(String str) {
        int len=str.length();
        if(len<2)return len>0&&str.charAt(0)=='x'?"":str;
        else
            return str.startsWith("x")&&str.endsWith("x")?str.substring(1,len-1):str.startsWith("x")?str.substring(1):str.endsWith("x")?str.substring(0,len-1):str;
    }
    public String withoutX2(String str) {
        String s="";
        for(int i=0;i<str.length();i++){
            if(i<2&&str.charAt(i)=='x')
                continue;
            else
                s+=str.charAt(i);
        }
        return s;
    }
    public String startWord(String str, String word)
    {
        int lenStr = str.length();
        int lenWord = word.length();
        String temp;
        if(lenStr >= lenWord)
        {
            temp = str.substring(1, lenWord);
            if(word.substring(1).equals(temp))
                return (str.charAt(0)+temp);
            else
                return "";
        }
        else
            return "";
    }


}
