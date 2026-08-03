import java.util.*;
public class Main {
    public static String secondWordUpper(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) {
            return "LESS";
        }
        return words[1].toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(secondWordUpper(str));
        sc.close();
    }
}