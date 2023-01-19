import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        boolean flag = true;
        int number;
        int choice;
        int odd = 0, even = 0;
        Scanner sc = new Scanner(System.in);
        while (flag){
            System.out.println("Enter the number:");
            number = sc.nextInt();
            if (number%2 == 0){
                even += number;
            }
            else{
                odd += number;
            }
            System.out.println("Press 1 to enter another number else press 2");
            choice = sc.nextInt();
            if (choice == 1){
                continue;
            }
            else {
                flag = false;
            }
        }
        System.out.println("even sum = " + even);
        System.out.println("odd sum = " + odd);
    }
}
