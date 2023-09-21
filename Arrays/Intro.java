import java.util.*;

public class Intro {
    public static void update(int arr[]){
        for(int i = 0; i<arr.length; i++){
            arr[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("marks 1 = "+ marks[0]);
        System.out.println("marks 2 = "+ marks[1]);
        System.out.println("marks 3 = "+ marks[2]);
        System.out.println("length of array = "+ marks.length);

        update(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
