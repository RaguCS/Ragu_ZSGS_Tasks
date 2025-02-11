package Task_2;

public class Program_27 {
    public static void main(String[] args) {
        Program_27 p=new Program_27();
        System.out.println(p.findSub("test123string","123"));
    }
    public int findSub(String s1,String s2){
        int len=s2.length();
        for(int i=0;i<s1.length();i++){
            if(s1.substring(i).startsWith(s2)){
                return i;
            }
        }
        return -1;
    }
}
