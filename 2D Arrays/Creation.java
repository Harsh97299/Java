import java.util.*;

class Creation{
    public static void rowwiseSum(int matrix[][]){
        int largestSum = Integer.MIN_VALUE;
        for (int i = 0; i<matrix.length; i++){
            int sum = 0;
            for (int j = 0; j<matrix[i].length; j++){
                sum += matrix[i][j];
            }
            if(largestSum<sum){
                largestSum = sum;
            }
            System.out.println("Sum of row " + i + " = " + sum);
        }
        System.out.println("Largest Sum = " + largestSum);
    }
    public static void findSmallestAndLargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix : ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix = ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // findSmallestAndLargest(matrix);
        rowwiseSum(matrix);
    }
}