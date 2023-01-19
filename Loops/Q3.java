import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, res = 1;
        System.out.println("Enter the number");
        num = sc.nextInt();
        for(int i = num; i > 0; i--){
            res *= i;
        }
        System.out.println("Factorial = " + res);
    }    
}
