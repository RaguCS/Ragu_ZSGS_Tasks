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
    public boolean prefixAgain(String str, int n) {
        String s=str.substring(0,n);
        for(int i=n;i<str.length();i++){
            if(str.substring(i).startsWith(s))return true;
        }
        return false;
    }
    public boolean xyzMiddle(String str) {
        String xyz = "xyz";
        int len = str.length();
        int mid = len / 2;

        if (len < 3)return false;
        if (len % 2 != 0)
            return xyz.equals(str.substring(mid-1,mid+2));
        else if (xyz.equals(str.substring(mid-1,mid+2)) || xyz.equals(str.substring(mid-2,mid+1)))
            return true;
        else
            return false;
    }
    public String getSandwich(String str) {
        int f = -1;
        int l = -1;
        for(int i=0; i < str.length()-4; i++) {
            if(str.startsWith("bread", i)) {
                if(f==-1) {
                    f=i;
                }
                l=i;
            }
        }
        if( f == l) {
            return "";
        }
        return str.substring(f+5,l);
    }

    public boolean sameStarChar(String str) {
        int z = -1;
        for(int i=1; i < str.length()-1; i++)
        {
            if(str.charAt(i) == '*') {
                if(str.charAt(i-1) == str.charAt(i+1)){
                    z=i;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i <str.length()-2; i += 3)
        {
            result.append(str.substring(i + 1, i + 3)).append(str.charAt(i));
        }
        return result.toString();
    }

    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        if(str.length() <3) return str;
        for(int i=0; i<str.length(); i++ ) {
            if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                result.append("zp");
                i += 2;
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public String starOut(String str) {
        String pattern = "([a-zA-Z0-9]{0,1})\\*+([a-zA-Z0-9]{0,1})";
        str = str.replaceAll(pattern, "");
        return str;
    }
    public String plusOut(String str, String word) {
        String result = "";
        int i=0;
        int end = 0;
        int l =str.length();
        while(i < str.length()) {
            end = i + word.length();
            if( end > l) {
                end=l;
            }
            if(str.substring(i,end).equals(word)) {
                result = result + word;
                i = i + word.length();
            }
            else {
                result = result + "+";
                i++;
            }
        }
        return result;
    }
    public String wordEnds(String str, String word) {
        String result = "";
        int i=0;
        int end = 0;
        int l =str.length();
        while( i < str.length()) {

            end = i + word.length();
            if( end > l) {
                end=l;
            }

            if(str.substring(i,end).equals(word)) {

                if(i>0) {
                    result = result + str.charAt(i-1);
                }

                if(i+word.length() <l) {
                    result = result + str.charAt(end);
                }

            }
            i++;
        }
        return result;
    }

}
