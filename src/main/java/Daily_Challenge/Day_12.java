package Daily_Challenge;

public class Day_12 {
    public static void main(String[] args) {
        Day_12 day = new Day_12();
        System.out.println(day.romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        String s1="MDCLXVI";
        return findInt(s,s1);
    }
    public int findInt(String s ,String roman) {
        if(s.isEmpty())return 0;
        char c=s.charAt(0);
        if(c == 'I') {
            return (roman.contains("I") ? 1 : -1) + findInt(s.substring(1), roman.substring(roman.indexOf("I") + 1));
        }else if(c == 'V') {
            return (roman.contains("V")?5:-5) + findInt(s.substring(1), roman.substring(roman.indexOf("V") + 1));
        }else if(c == 'X') {
            return (roman.contains("X")?10:-10) + findInt(s.substring(1), roman.substring(roman.indexOf("X") + 1));
        }else if(c == 'L') {
            return (roman.contains("L")?50:-50) + findInt(s.substring(1), roman.substring(roman.indexOf("L") + 1));
        }else if(c == 'C') {
            return (roman.contains("C")?100:-100) + findInt(s.substring(1), roman.substring(roman.indexOf("C") + 1));
        }else if(c == 'D') {
            return (roman.contains("D")?500:-500) + findInt(s.substring(1), roman.substring(roman.indexOf("D") + 1));
        }else if(c == 'M') {
            return (roman.contains("M")?1000:-1000) + findInt(s.substring(1), roman.substring(roman.indexOf("M") + 1));
        }
        return 0;
    }

}
