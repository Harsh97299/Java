public class Largest {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }    
    public static void main(String[] args) {
        int numbers[] = {12, 34, 56, 10, 45, 67, 66, 56, 29};

        System.out.println("largrest integer = "+ getLargest(numbers));
    }
}
