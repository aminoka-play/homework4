public class Task9 {
    static boolean isArmstrong(int n) {
        int a = n;
        int k = 0;
        while (a > 0) {
            int d = a % 10;
            k = k + d * d * d;
            a = a / 10;
        }
        return k == n;
    }
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}