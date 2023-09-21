public class BubbleSort{
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int swaps = 0;
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swaps == 0){
                break;
            }
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
        bubbleSort(arr);
        printArr(arr);
    }
}