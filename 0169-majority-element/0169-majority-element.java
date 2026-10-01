class Solution {
    public int majorityElement(int[] nums) {
     int count = 0;
     int currentNumber = 0;

     for(int num : nums){
        if (count == 0){
            currentNumber = num;
        }

       if(num == currentNumber){
            count ++;
        } 
        else {
            count --;
        }
     }
        return currentNumber;
    }
}