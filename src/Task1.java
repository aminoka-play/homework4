import java.util.Scanner;
public class Task1 {
    static void printStrip(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printStrip(n, '#');
    }
}