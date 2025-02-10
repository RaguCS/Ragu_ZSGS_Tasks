package Task_2;

public class Program_2 {
        public static void main(String[] args) {
            int a = 5;  // Binary:  0101
            int b = 3;  // Binary:  0011

            // AND Operator
            System.out.println("a & b = " + (a & b));  // 0101 & 0011 = 0001 (1)
            // OR Operator
            System.out.println("a | b = " + (a | b));  // 0101 | 0011 = 0111 (7)
            // XOR Operator
            System.out.println("a ^ b = " + (a ^ b));  // 0101 ^ 0011 = 0110 (6)
            // NOT Operator
            System.out.println("~a = " + (~a));  // ~0101 = 1010 (in 2's complement, -6)
            // Left Shift Operator
            System.out.println("a << 1 = " + (a << 1));  // 0101 << 1 = 1010 (10)

            // Right Shift Operator
            System.out.println("a >> 1 = " + (a >> 1));  // 0101 >> 1 = 0010 (2)

            // Unsigned Right Shift Operator
            int negativeNumber = -5;
            System.out.println("negativeNumber >>> 1 = " + (negativeNumber >>> 1));
        }
    }


