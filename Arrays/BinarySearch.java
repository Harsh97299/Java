public class BinarySearch{
    public static int binarySearch(int arr[], int key){
        int start = 0, end = (arr.length) - 1;
        int mid;
        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] < key){
                start = mid;
            }
            else if(arr[mid] > key){
                end = mid;
            }
            else if(arr[mid] == key){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 4;
        System.out.println("key is at: "+ binarySearch(arr, key));
    }
}