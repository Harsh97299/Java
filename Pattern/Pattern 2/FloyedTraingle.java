public class FloyedTraingle {
    public static void floydTriangle(int n){
        int count = 1;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTriangle(5);
    }    
}
