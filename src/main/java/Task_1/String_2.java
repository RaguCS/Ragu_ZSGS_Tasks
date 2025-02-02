package Task_1;

public class String_2 {
    public String doubleChar(String str) {
        String s="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            s=s+c+c;
        }
        return s;
    }
    public int countHi(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
                count++;
            }
        }
        return count;
    }
    public boolean catDog(String str) {
        if(str.length()<6)return str.contains("dog")||str.contains("cat")?false:true;
        int count=0;
        for(int i=0;i<str.length()-2;i++){
            if((str.charAt(i)=='c'&&str.charAt(i+1)=='a'&&str.charAt(i+2)=='t'))
            {
                count++;
            }
            if(str.charAt(i)=='d'&&str.charAt(i+1)=='o'&&str.charAt(i+2)=='g'){
                count--;
            }
        }
        return count==0;
    }
    public int countCode(String str) {
        int count=0;
        if(str.length()<4)return 0;
        for(int i=0;i<str.length()-3;i++){
            if(str.charAt(i)=='c'&&str.charAt(i+3)=='e'&&str.charAt(i+1)=='o'){
                count++;
            }
        }
        return count;
    }
    public boolean endOther(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        return a.endsWith(b)||b.endsWith(a);
    }
    public boolean xyzThere(String str) {
        if(str.length()<3)return false;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='x'&&str.charAt(i+1)=='y'&&str.charAt(i+2)=='z'){
                if(i==0)return true;
                else if(str.charAt(i-1)!='.')return true;
            }
        }
        return false;
    }
    public boolean bobThere(String str) {
        if(str.length()<3)return false;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='b'&&str.charAt(i+2)=='b')return true;
        }
        return false;
    }
    public boolean xyBalance(String str) {
        int y=-1,x=-1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='y')
                y=i;
            else if(c=='x')
                x=i;
        }
        return x<y||x==y;
    }
    public String mixString(String a, String b) {
        int len=Math.max(a.length(),b.length());
        int i=0;
        String s="";
        while(i<len){
            if(i<a.length())
                s=s+a.charAt(i);
            if(i<b.length())
                s=s+b.charAt(i);
            i++;
        }
        return s;
    }
    public String repeatEnd(String str, int n) {
        String s=str.substring(str.length()-n),res="";
        for(int i=0;i<n;i++)
            res+=s;
        return res;
    }
    public String repeatFront(String str, int n) {
        String s="";
        for(int i=n;i>=0;i--){
            s+=str.substring(0,i);
        }
        return s;
    }
    public String repeatSeparator(String word, String sep, int count) {
        String s="";
        for(int i=0;i<count-1;i++){
            s+=word+sep;
        }
        if(count!=0)
            s+=word;
        return s;
    }

}
