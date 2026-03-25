class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int n : nums){
            if (seen.contains(n)){
                answer.add(n);
            } else{
                seen.add(n);
            }
        }
        return answer;
    }
}
