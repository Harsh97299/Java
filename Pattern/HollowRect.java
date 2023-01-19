public class HollowRect {
    public static void main(String[] args) {
        int len = 8;
        int brd = 11;
        for(int i = 1; i <= len; i++){
            if (i == 1 || i == len){
                for(int j = 1; j <= brd; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 1; j <= brd-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
