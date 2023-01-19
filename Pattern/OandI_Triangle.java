public class OandI_Triangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1){
                    num = i%2;
                }
                else{
                    if(num == 0){
                        num++;
                    }
                    else{
                        num--;
                    }
                }
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }    
}
