package Task_1;

public class Recursion_1 {
    public int factorial(int n)
    {
        if(n == 1)
            return 1;
        return n*factorial(n-1);
    }
    public int bunnyEars(int bunnies)
    {
        if(bunnies == 0)
            return 0;
        return 2+bunnyEars(bunnies-1);
    }
    public int fibonacci(int n)
    {
        if(n < 2)
            return n;
        return fibonacci(n-2)+fibonacci(n-1);
    }
    public int bunnyEars2(int bunnies)
    {
        if(bunnies == 0)
            return 0;
        if(bunnies % 2 == 1)
            return 2 + bunnyEars2(bunnies-1);
        return 3 + bunnyEars2(bunnies-1);
    }
    public int triangle(int rows)
    {
        if(rows < 2)
            return rows;
        return rows + triangle(rows-1);
    }
    public int sumDigits(int n)
    {
        if(n < 10)
            return n;
        return sumDigits(n/10) + n%10;
    }
    public int count7(int n)
    {
        if(n == 0)
            return 0;
        if(n % 10 == 7)
            return 1+count7(n/10);
        return count7(n/10);
    }
    public int count8(int n)
    {
        if(n == 0)
            return 0;
        if(n % 10 == 8)
        {
            if(n / 10 % 10 == 8)
                return 2+count8(n/10);
            return 1+count8(n/10);
        }
        return count8(n/10);
    }
    public int powerN(int base, int n)
    {
        if(n == 1)
            return base;
        return base*powerN(base, n - 1);
    }
    public int countX(String str)
    {
        if(str.length() == 0)
            return 0;
        if(str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));
        return countX(str.substring(1));
    }
    public int countHi(String str)
    {
        if(str.length() < 2)
            return 0;
        if(str.charAt(0) == 'h' && str.charAt(1) == 'i')
            return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }
    public String changeXY(String str)
    {
        char ch;
        if(str.length() == 0)
            return str;
        ch = str.charAt(0);
        if(ch == 'x')
            return 'y' + changeXY(str.substring(1));
        return ch + changeXY(str.substring(1));
    }
    public String changePi(String str)
    {
        String left;
        if(str.length() < 2)
            return str;
        if(str.substring(0, 2).equals("pi"))
            return "3.14" + changePi(str.substring(2));
        return str.charAt(0) + changePi(str.substring(1));
    }
    public String noX(String str)
    {
        char ch;
        if(str.length() == 0)
            return str;
        ch = str.charAt(0);
        if(ch == 'x')
            return noX(str.substring(1));
        return ch + noX(str.substring(1));
    }
    public boolean array6(int[] nums, int index)
    {
        if(index == nums.length)
            return false;
        if(nums[index] == 6)
            return true;
        return array6(nums, index + 1);
    }
    public int array11(int[] nums, int index)
    {
        if(index == nums.length)
            return 0;
        if(nums[index] == 11)
            return 1 + array11(nums, index + 1);
        return array11(nums, index + 1);
    }
    public boolean array220(int[] nums, int index)
    {
        if(index >= nums.length - 1)
            return false;
        if(nums[index] * 10 == nums[index+1])
            return true;
        return array220(nums, index + 1);
    }
    public String allStar(String str)
    {
        if(str.length() < 2)
            return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
    public String pairStar(String str)
    {
        if(str.length() < 2)
            return str;
        if(str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        return str.charAt(0) + pairStar(str.substring(1));
    }
    public String endX(String str)
    {
        if(str.length() == 0)
            return str;
        if(str.charAt(0) == 'x')
            return endX(str.substring(1)) + 'x';
        return str.charAt(0) + endX(str.substring(1));
    }
    public int countPairs(String str)
    {
        if(str.length() < 3)
            return 0;
        if(str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }
    public int countAbc(String str)
    {
        String left;
        if(str.length() < 3)
            return 0;
        left = str.substring(0, 3);
        if(left.equals("abc"))
            return 1 + countAbc(str.substring(3));
        if(left.equals("aba"))
            return 1 + countAbc(str.substring(2));
        return countAbc(str.substring(1));
    }
    public int count11(String str)
    {
        if(str.length() < 2)
            return 0;
        if(str.substring(0, 2).equals("11"))
            return 1 + count11(str.substring(2));
        return count11(str.substring(1));
    }
    public String stringClean(String str)
    {
        if(str.length() < 2)
            return str;
        if(str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));
        return str.charAt(0) + stringClean(str.substring(1));
    }
    public int countHi2(String str)
    {
        if(str.length() < 2)
            return 0;
        if(str.length() == 2)
            return (str.equals("hi")) ? 1 : 0;
        if(str.charAt(0) == 'x')
        {
            if(str.substring(1, 3).equals("hi"))
                return countHi2(str.substring(3));
            return countHi2(str.substring(1));
        }
        if(str.substring(0, 2).equals("hi"))
            return 1 + countHi2(str.substring(2));
        if(str.substring(1, 3).equals("hi"))
            return 1 + countHi2(str.substring(3));
        return countHi2(str.substring(2));
    }
    public String parenBit(String str)
    {
        int len = str.length();
        if(str.charAt(0) != '(')
        {
            if(str.charAt(len - 1) != ')')
                return parenBit(str.substring(1, len -1));
            return parenBit(str.substring(1));
        }
        if(str.charAt(len - 1) != ')')
            return parenBit(str.substring(0, len - 1));
        return str;
    }
    public boolean nestParen(String str)
    {
        int len = str.length();
        if(len == 0)
            return true;
        if(str.charAt(0) == '(' && str.charAt(len - 1) == ')')
            return nestParen(str.substring(1, len - 1));
        return false;
    }
    public int strCount(String str, String sub)
    {
        int sLen = sub.length();
        if(str.length() < sLen)
            return 0;
        if(str.substring(0, sLen).equals(sub))
            return 1 + strCount(str.substring(sLen), sub);
        return strCount(str.substring(1), sub);
    }
    public boolean strCopies(String str, String sub, int n)
    {
        if(n == 0)
            return true;
        if(str.length() < sub.length())
            return false;
        if(str.substring(0, sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n - 1);
        return strCopies(str.substring(1), sub, n);
    }
    public int strDist(String str, String sub)
    {
        int stLen = str.length();
        int sbLen = sub.length();
        if(stLen < sbLen)
            return 0;
        if(str.substring(0, sbLen).equals(sub))
        {
            if(str.substring(stLen - sbLen, stLen).equals(sub))
                return stLen;
            return strDist(str.substring(0, stLen - 1), sub);
        }
        return strDist(str.substring(1), sub);
    }
}
