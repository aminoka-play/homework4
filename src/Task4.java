import java.util.Scanner;
public class Task4 {
    static void printMatrix(int n, int m) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        printMatrix(n, m);
    }
}
