package practice;

/**
 * PrintSubarrays
 */
public class Subarrays {
    public static void printarr(int nums[]){
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                System.out.print("( ");
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k] + " ,");
                }
                System.out.print(" )");
            }
            System.out.println();
        }
    }
    public static void minAndMax(int nums[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum;
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                System.out.print("( ");
                sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k] + " ,");
                    sum+=nums[k];
                }
                System.out.print(" )");
                System.out.print(" = "+sum);
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
            System.out.println();
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }
    public static void prefixarr(int nums[]){
        int prefix[] = new int[nums.length];
        int sum = 0;
        // creating prefix array
        for(int i = 0; i<prefix.length; i++){
            sum+=nums[i];
            prefix[i] = sum;
        }
        // calculating maximum
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if(i-1 == -1){
                    sum = prefix[j];
                }
                else{
                    sum = prefix[j] - prefix[i-1];
                }
                maximum = Math.max(maximum, sum);
            }
        }
        System.out.println("max = "+maximum);
    }
    // kadan's algorithm
    public static void kadan(int nums[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){
            cs += nums[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Max = " + ms);
    }
    public static void main(String[] args) {
        int nums[] = {1,-2,3,-4,5,6};
        minAndMax(nums);
        prefixarr(nums);
        kadan(nums);
    }
}