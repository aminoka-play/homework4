import java.util.Scanner;
public class Task14 {
    static int transformDigits(int n) {
        int k = 0;
        int p = 1;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) {
                d++;
            } else {
                d--;
            }
            k = k + d * p;
            p = p * 10;
            n = n / 10;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(transformDigits(n));
    }
}
