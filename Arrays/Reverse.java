public class Reverse {
    public static void reverse(int arr[]){
        int temp;
        for(int i = 0, j = arr.length-1; i<(arr.length)/2; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12,45,67,25,48,34,78,234,76,4,32};
        System.out.print("Array = ");
        printArr(arr);
        reverse(arr);
        System.out.print("After reverse = ");
        printArr(arr);

    }
}
