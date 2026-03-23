class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Hash Set because all we need to know is if we have seen it.
        HashSet<Integer> set = new HashSet<>();
        // We need to return an array so create an array.
        ArrayList<Integer> answer = new ArrayList<>();
        for(int n : nums){
            set.add(n);
        }
        // start at 1 because range is [1,n]. And dont forget less than or equals to.
        for(int i = 1; i <= nums.length; i++){
            if(set.contains(i)){
            } else{
                answer.add(i);
            }
        }
        return answer;
    }
}
