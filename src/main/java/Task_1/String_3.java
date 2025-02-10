package Task_1;

public class String_3 {
    public int countYZ(String str) {
        int len = str.length();
        int count = 0;
        str = str.toLowerCase();

        for(int i=0; i < len; i++) {
            if(str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                if(i+1 == len) {
                    count++;
                }
                if(i<len-1 && !Character.isLetter(str.charAt(i+1))) {
                    count++;
                }
            }
        }
        return count;
    }
    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove , "");
    }
    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount =0;
        int isMax = 0;
        int notMax =0;
        for(int i=0; i < str.length(); i++) {

            isMax = i +2;
            if(isMax > str.length()) {
                isMax = str.length();
            }
            notMax = i +3;
            if(notMax > str.length()) {
                notMax = str.length();
            }
            if(str.substring(i,isMax).equals("is")) {
                isCount++;
            }

            if(str.substring(i,notMax).equals("not")) {
                notCount++;
            }

        }
        return (isCount == notCount);
    }
    public boolean gHappy(String str) {
        if (str.length() < 1) return true;
        str = "x" + str + "x";
        int fl=0;
        for(int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if(str.charAt(i+1) != 'g' && str.charAt(i-1) != 'g') {
                    return false;
                }
                fl=1;
            }
        }
        return (fl==1);
    }
    public int countTriple(String str) {
        String a = "";
        int count=0;
        for(int i=0; i <= str.length()-3;i++) {
            a = ""+ str.charAt(i);
            if(str.substring(i,i+3).equals(a+a+a)) {
                count++;
            }
        }
        return count;
    }
    public int sumDigits(String str) {
        int sum=0;
        for(int i=0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                sum = sum + Integer.parseInt(str.substring(i,i+1));
            }
        }
        return sum;
    }
    public String sameEnds(String string) {
        String s = "";
        String large = "";
        int end = 0;
        for(int i=0; i<string.length(); i++) {
            s = string.substring(0,i);
            for(int j=i; j<=string.length()-s.length(); j++) {
                if(string.substring(j,j+s.length()).equals(s))
                {
                    large = s;
                }
            }
        }
        return large;
    }
    public String mirrorEnds(String string) {
        String s = "";
        String large = "";
        int end = 0;
        for(int i=0; i<=string.length(); i++) {
            s = string.substring(0,i);
            String ss = new StringBuffer(s).reverse().toString();

            String e = string.substring(string.length()-i);

            if(ss.equals(e)){
                large = s;
            }
        }
        return large;
    }
    public int maxBlock(String str) {
        if(str.length() < 1) return 0;
        int count = 0;
        int ans=0;
        for(int i=0; i < str.length(); i++) {

            count = 0;
            int j = i+1;
            while(j < str.length() && str.charAt(i) == str.charAt(j)){
                count++;
                j++;
            }

            if(count > ans) {
                ans = count;
            }
        }
        return ans+1;
    }
    public int sumNumbers(String str) {
        String num = "0";
        int sum = 0;
        str = str + "x";
        for(int i =0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i)) ) {
                num = num + str.charAt(i);
            }

            else if(!Character.isDigit(str.charAt(i))) {
                sum = sum + Integer.parseInt(num);
                num = "0";
            }

        }
        return sum;

    }
    public String notReplace(String str) {

        String result = "";
        str = " " + str + "  ";
        for(int i=0; i <=str.length()-2; i++) {
            if(str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))
                    && !Character.isLetter(str.charAt(i+2)))
            {
                result = result + "is not";
                i = i+1;
            }
            else {
                result = result + str.charAt(i);
            }
        }
        return result.substring(1,result.length()-1);
    }
}
