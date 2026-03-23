class Solution {
    public int missingNumber(int[] nums) {
        // HashMap bc we only need to know if we saw it.
        HashSet<Integer> set = new HashSet<>();
        // we need to return an integer
        int answer = 0;
        for(int n: nums){
            set.add(n);
        }
        // less than or equal bc we need to go all the way.
        for(int i = 0; i <= nums.length; i++){
            if(set.contains(i)){
            } else{
                answer = i;
            }
        }
        return answer;
    }
}
