import java.util.*;
public class Main {
    public static int sumOfPowerDigits(int n) {
        int temp = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfPowerDigits(n));
        sc.close();
    }
}