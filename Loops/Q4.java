import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " X " + num + " = " + (num*i));
        }
    }    
}
