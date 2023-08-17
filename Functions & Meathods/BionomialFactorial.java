public class BionomialFactorial {
    public static int factorial(int num){
        int res = 1;
        for(int i = 1; i <= num; i++){
            res = res*i;
        }
        return res;
    }
    public static int bio(int n, int r){
        return(factorial(n)/(factorial(r)*factorial(n-r)));
    }
    public static void main(String[] args) {
        int n = 7;
        int r = 3;
        int biofact = bio(n,r);
        System.out.println(biofact);
    }
}
