package Task_2;

public class Program_11 {
    public static void main(String[] args) {
    Program_11 p = new Program_11();
    p.printNTimes("a1c2");
    }
    public void printNTimes(String str) {
        int count=0;
        char c=' ';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>'9'||str.charAt(i)<'0'){
              if(c!=' '){
                  for(int j=0;j<count;j++){
                      System.out.print(c);
                  }
                  c=str.charAt(i);
                  count=0;
              }else{
                  c=str.charAt(i);
              }
            }else{

                count=(count*10)+str.charAt(i)-'0';
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(c);
        }
    }
}
