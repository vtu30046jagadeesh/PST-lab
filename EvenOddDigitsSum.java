import java.util.*;

public class EvenOddDigitsSum {

    public int evenOddDigitsSum(int input1, String input2) {
        int sum = 0;

        while (input1 > 0) {
            int d = input1 % 10;

            if (input2.equalsIgnoreCase("even") && d % 2 == 0) {
                sum += d;
            }

            if (input2.equalsIgnoreCase("odd") && d % 2 != 0) {
                sum += d;
            }

            input1 /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        EvenOddDigitsSum obj = new EvenOddDigitsSum();

        System.out.println(obj.evenOddDigitsSum(123456, "even")); 
        System.out.println(obj.evenOddDigitsSum(123456, "odd")); 
    }
}