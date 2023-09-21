public class SelectionSort {
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            //find min index
            int minIndex = i;
            for(int j = i; j<arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
