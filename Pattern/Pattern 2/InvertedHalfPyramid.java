public class InvertedHalfPyramid {
    public static void invertedHalfPyramid(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows-i-1; j++){
                System.out.print(" ");
            }
            for(int j = rows-i-1; j < rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedHalfPyramid(5);
    }    
}
