public class SelectionRev {
    public static void selectionRev(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int greatest = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j] > arr[greatest]){
                    greatest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[greatest];
            arr[greatest] = temp;
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
        selectionRev(arr);
        printArr(arr);
    }
}
