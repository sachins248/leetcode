class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int n : nums){
            if(seen.contains(n)){
                return true;
            } else{
                seen.add(n);
            }
        }
        return false;
    }
}


// Add each number to a set as you go if its already in the set you found a duplicate.
