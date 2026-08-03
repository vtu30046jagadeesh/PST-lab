import java.util.*;
public class Main {
    public static int mostFrequentDigit(int n) {
        int[] freq = new int[10];
        n = Math.abs(n);
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int max = 0;
        int digit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(mostFrequentDigit(n));
        sc.close();
    }
}