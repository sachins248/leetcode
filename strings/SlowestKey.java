class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        // dedicate starting spots
        int maxDuration = releaseTimes[0];
        char slowest = keysPressed.charAt(0);
        
        for(int i = 1; i < releaseTimes.length; i++){
            // set duration and the current element we on
            int duration = releaseTimes[i] - releaseTimes[i-1];
            char current = keysPressed.charAt(i);
            
            // if statement that checks if duration is bigger or if they equal but letter is bigger
            if(duration > maxDuration || duration == maxDuration && current > slowest){
                // update our positions
                maxDuration = duration;
                slowest = current;
            }
        }
        return slowest;
    }
}
