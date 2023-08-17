public class HollowRect {
    public static void main(String[] args) {
        for(int rows = 0; rows < 4; rows++){
            for(int cols = 0; cols < 5; cols++){
                if(rows == 0 || rows == 3 || cols == 0 || cols == 4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
