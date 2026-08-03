import java.util.*;
class UserMainCode {
    public int countPrimesInRange(int input1, int input2) {
        int count = 0;
        for (int num = input1; num <= input2; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.countPrimesInRange(input1, input2));
        sc.close();
    }
}