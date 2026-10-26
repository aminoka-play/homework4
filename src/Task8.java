import java.util.Scanner;
public class Task8 {
    static String decimalToBinary(int n) {
        String k = "";
        while (n > 0) {
            k = (n % 2) + k;
            n = n / 2;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Binary = " + decimalToBinary(n));
    }
}