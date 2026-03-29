class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        int current = 0;
        
        for(int i = 0; i < word.length(); i++){
            int targetPos = word.charAt(i) - 'a';
            int path1 = Math.abs(targetPos - current);
            int path2 = 26 - path1;
            int shortest = Math.min(path1,path2);
            
            time += shortest + 1;
            
            current = targetPos;
        }
        return time;
    }
}
