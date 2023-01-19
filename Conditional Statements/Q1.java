import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = (number > 0) ? "Positive" : "Negative";

        System.out.println(result);
    }
}
