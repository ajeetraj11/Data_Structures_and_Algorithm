class Solution {
    public int maxProduct(int[] nums) {

        long currMax = nums[0];
        long currMin = nums[0];
        long maxProd = nums[0];

        for(int i = 1; i< nums.length; i++){
        long currVal = nums[i];

        long prevMax = currMax;
        long prevMin = currMin;

        currMax = Math.max(currVal, Math.max(prevMax * currVal, prevMin * currVal));

        currMin = Math.min(currVal, Math.min(prevMax * currVal, prevMin * currVal));

        if(maxProd < currMax){
            maxProd = currMax;
        }

        }
        return (int)maxProd;
    }
}