public class MaxSubArraySum {
    public static void maxSubArraysSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                currSum = 0;
                System.out.print("(");
                
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    currSum += arr[k];
                }
                System.out.print(" = "+currSum);
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                System.out.print(")");
            }
            System.out.println();
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void prefix(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixArr[] = new int[arr.length];
        
        for(int i = 0; i<arr.length; i++){
            currSum += arr[i];
            prefixArr[i] = currSum;
        }
        
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                currSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void kadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i = 0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        if(maxSum == 0){
            maxSum = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length; i++){
                maxSum = Math.max(maxSum, arr[i]);
            }
        }
        System.out.println("Max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,1,-2,-1,-5,-3};
        // maxSubArraysSum(arr);
        // prefix(arr);
        kadane(arr);
    }
}
