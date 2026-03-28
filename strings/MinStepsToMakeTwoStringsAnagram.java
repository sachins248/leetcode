class Solution {
    public int minSteps(String s, String t) {
        //Count how many of each letter s has, subtract how many t has. Whatever s has extra, that's how many replacements you need.
        int[] frequency = new int[26];
        for(int i = 0; i < s.length(); i++){
            // make sure you subtarct asci a so you get to your desired index.
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }
        int answer = 0;
        for(int c : frequency){
            // we only want positive values bc we are only changing t.
            if(c > 0){
                answer += c;
            }
        }
        return answer;
    }
}
