class Solution {
    public void moveZeroes(int[] nums) {
        // No need to use a data structure for this one bc we are manipulating the array in place
        // slow pointer
        int slow = 0;
        // for loop the algo is js if fast sees a non 0 update that value to slow then at the end make everything left a 0
        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        // second for loop this time we are just updating everything left to 0 but dont return anything as this is a void func.
        for(int i = slow; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
