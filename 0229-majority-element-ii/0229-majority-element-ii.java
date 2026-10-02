class Solution {
    public List<Integer> majorityElement(int[] nums) {

    int element1 = 0;
    int element2 = 0;
    int count1 = 0;
    int count2 = 0;

    for(int num : nums){

        if(count1 == 0 && element2 != num){
            element1 = num;
            count1 = 1;
        }

        else if(count2 == 0 && element1 != num){
            element2 = num;
            count2 = 1;
        }
        
        else if (element1 == num ) count1++;
        else if (element2 == num ) count2++;

        else {
        count1--;
        count2--;
        }
    }

    int varified1 = 0;
    int varified2 = 0;
    for(int val : nums){
        if(val == element1){
            varified1++;
        }
        if(val == element2){
            varified2++;
        }
    }

    int max = nums.length/3;
    ArrayList<Integer> list = new ArrayList<>();


    if(varified1 > max) list.add(element1);
    if(element2 != element1 && varified2 > max) list.add(element2);

    return list;

    }
}