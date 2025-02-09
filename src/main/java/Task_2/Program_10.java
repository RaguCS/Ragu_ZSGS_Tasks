package Task_2;

public class Program_10 {
    public static void main(String[] args) {
        Program_10 p = new Program_10();
        p.reverseString("ragu",0);
    }
    public void reverseString(String s,int index) {
        if(index==s.length()-1){
            System.out.print(s.charAt(index));
            return;
        }
        reverseString(s,index+1);
        System.out.print(s.charAt(index));
    }
}
