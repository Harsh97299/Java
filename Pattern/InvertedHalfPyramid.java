public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            int j;
            for(j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            while(j <= n){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }    
}
