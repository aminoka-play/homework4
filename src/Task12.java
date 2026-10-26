import java.util.Scanner;
public class Task12 {
    static int reverseNumber(int n) {
        int k = 0;
        while (n > 0) {
            k = k * 10 + n % 10;
            n = n / 10;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(reverseNumber(n));
    }
}