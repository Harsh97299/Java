import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        c = sc.nextInt();
        
        int avg = (a+b+c)/3;
        System.out.println("Average = " + avg);
    }
}
