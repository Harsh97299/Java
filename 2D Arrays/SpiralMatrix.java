public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        int count = 0;
        int total = matrix.length * matrix[0].length;
        while(count < total){
            for(int i = startCol; count < total && i<=endCol; i++){
                System.out.print(matrix[startRow][i] + " ");
                count++;
            }
            startRow++;
            //end col
            for(int i = startRow; count < total && i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
                count++;
            }
            endCol--;
            //end row
            for(int i = endCol; count < total && i>=startCol; i--){
                System.out.print(matrix[endRow][i] + " ");
                count++;
            }
            endRow--;
            //start col
            for(int i = endRow; count < total && i>=startRow; i--){
                System.out.print(matrix[i][startCol] + " ");
                count++;
            }
            startCol++;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix1[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printSpiral(matrix);
    }
}
