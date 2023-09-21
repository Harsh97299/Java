public class TrappingRainwater {
    public static int trap(int height[]){
        if (height.length < 3){
            return 0;
        }
        int n = height.length;
        int waterLevel[] = new int[n];
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            if(leftMax[i-1] < height[i]){
                leftMax[i] = height[i];
            }
            else{
                leftMax[i] = leftMax[i-1];
            }
        }
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            if(rightMax[i+1] < height[i]){
                rightMax[i] = height[i];
            }
            else{
                rightMax[i] = rightMax[i+1];
            }
        }
        int ans = 0;
        for(int i = 0; i<n; i++){
            waterLevel[i] = Math.min(leftMax[i],rightMax[i])-height[i];
            ans += waterLevel[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int water = trap(height);
        System.out.println(water);
    }
}
