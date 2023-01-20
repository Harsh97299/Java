public class Butterfly {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1; i <= 8; i++) {
            int j = 1;
            if(i <= n/2){
                while(j <= i){
                    System.out.print("*");
                    j++;
                }
                while(j <= n-i){
                    System.out.print(" ");
                    j++;
                }
                while(j <= n){
                    System.out.print("*");
                    j++;
                }
                System.out.println();
            }
            
        }
        
    }
}
