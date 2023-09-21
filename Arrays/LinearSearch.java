
public class LinearSearch {
    public static int linearSearch(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {12, 34, 56, 10, 45, 67, 66, 56, 29};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key is at "+index+" index");
        }
    }
}
