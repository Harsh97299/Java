import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        float pencil, pen, eraser;
        float total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil : ");
        pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen : ");
        pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser : ");
        eraser = sc.nextFloat();
        total = pencil + pen + eraser;
        System.out.println("Total cost = "+total);
        System.out.println("Total cost after GST = "+ (total+((total/100) * 18)));
    }    
}
