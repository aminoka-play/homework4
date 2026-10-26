import java.util.Scanner;
public class Task15 {
    static boolean isPalindrome(int n) {
        int a = n;
        int k = 0;
        while (a > 0) {
            k = k * 10 + a % 10;
            a = a / 10;
        }
        return k == n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
