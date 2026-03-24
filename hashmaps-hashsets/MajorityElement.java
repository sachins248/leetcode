class Solution {
    public int majorityElement(int[] nums) {
        // HashMap bc i need to know something abt the number(how many times we saw it)
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        int answer = 0;
        for(int n: nums){
            // get the value associated with n, 0 if never seen before.
            map.put(n , map.getOrDefault(n,0) + 1);
            // compare that value to max count if greater set max count to n and return n
            // after all elements have been thru.
            if(map.get(n) > maxCount){
                maxCount = map.get(n);
                answer = n;
            }
        }
        return answer;
    }
}
