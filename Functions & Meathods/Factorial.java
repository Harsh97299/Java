import java.util.*;

public class Factorial {
    public static int factorial(int fact){
        if(fact == 0){
            return 1;
        }
        else{
            int res = 1;
            for(int i = 1; i <= fact; i++){
                res = res * i;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
    }
}
