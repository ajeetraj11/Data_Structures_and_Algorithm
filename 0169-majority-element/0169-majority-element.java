class Solution {
    public int majorityElement(int[] nums) {
           HashMap<Integer, Integer> hm = new HashMap<>();
        int max = nums.length /2;
        for(int num : nums){
            int updatedFrequency = hm.getOrDefault(num, 0)+ 1;
            hm.put(num, updatedFrequency);

            if(updatedFrequency > max) return num;
        }

        return -1;
        
    }
}