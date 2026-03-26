class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0; // used to keep track of what current is at after we reset.
        int current = 1; // start at 1 bc we saw the first number.
        int count = 0;
        for(int i = 1; i < s.length(); i++){
            // if the numbers are the same
            if(s.charAt(i) == s.charAt(i-1)){
                current++; // add one to the current count
            } else{
                // Take the smaller of the two group sizes, and add that number to my running total. If i have 3 0s and 2 1s i can only make 2 valid groups.
                count += Math.min(prev,current);
                prev = current; // save current into prev before we update 
                current = 1; // reset current back to 1.
            }
        }
        // for the last group bc it wont add them unless we put this because it never switched.
        count += Math.min(prev,current);
        return count;
    }
}
