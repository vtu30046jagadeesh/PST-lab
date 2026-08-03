import java.util.*;
public class Main {
    public static int uniqueDigitsCount(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(uniqueDigitsCount(n));
        sc.close();
    }
}