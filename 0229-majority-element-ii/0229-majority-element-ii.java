class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int max = nums.length/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> element = new ArrayList<>();

        for(int num : nums){
            int frquencyUpdate = map.getOrDefault(num, 0) + 1;
            map.put(num, frquencyUpdate);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                element.add(entry.getKey());
            }
        }
        return element;
    }
}