package Task_2;

public class Program_1 {
    public static void main(String[] args) {
    Program_1 p1=new Program_1();
        System.out.println(p1.printToZ('X'));
    }
    public String printToZ(char c){
        StringBuilder s= new StringBuilder();
        for (int i=c;i<=(c+('Z'-c));i++){
            s.append((char)i);
        }
        return s.toString();
    }
}
