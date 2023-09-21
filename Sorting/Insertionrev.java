public class Insertionrev {
    public static void insertionRev(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int pos = i;
            for(int j = i; j>0 && arr[j-1] < temp; j--){
                arr[j] = arr[j-1];
                pos--;
            }
            arr[pos] = temp;
            printArr(arr);
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        printArr(arr);
        insertionRev(arr);
        printArr(arr);
    }
}
