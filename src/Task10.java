import java.util.Scanner;
public class Task10 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int k = b;
            b = a % b;
            a = k;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("GCD = " + gcd(a, b));
    }
}
