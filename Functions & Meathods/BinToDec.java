public class BinToDec {
    public static void bintodec(int binNum){
        int myNum = binNum;
        int dec = 0;
        int pow = 0;
        while (binNum > 0) {
            int ld = binNum % 10;
            dec += ld * (int)Math.pow(2, pow);
            pow++;
            binNum = binNum/10;
        }
        System.out.println(myNum + " in decimal = " + dec);
    }
    public static void main(String[] args) {
        bintodec(111);
    }
}
