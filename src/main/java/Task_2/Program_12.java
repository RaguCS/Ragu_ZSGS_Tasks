package Task_2;

public class Program_12 {
    public static void main(String[] args) {
        Program_12 p = new Program_12();
        System.out.println(p.alphabetOrNot('5'));
    }
    public boolean alphabetOrNot(char c){
        return c>='a' && c<='z'||c>='A' && c<='Z';
    }
}
