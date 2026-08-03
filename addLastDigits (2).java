import java.util.Scanner;
public class Main {
    public static int addLastDigits(int input1, int input2) {
        if (input1 < 0) input1 = -input1;
        if (input2 < 0) input2 = -input2;
        return (input1 % 10) + (input2 % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println(addLastDigits(input1, input2));
        sc.close();
    }
}