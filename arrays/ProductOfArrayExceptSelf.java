class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        // place a 1 at index 0 so you dont mess up the array.
        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        // fill right to left so 0 at nums.length - 1 bc thats the last element.
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i > -1; i--){
            right[i] = right[i+1] * nums[i + 1];
        }
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            // very simple
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
}
