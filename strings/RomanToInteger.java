class Solution {
    public int romanToInt(String s) {
        // declare the total that we will return 
        int total = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        for(int i = 0; i < s.length(); i++){

            // our current element that we are on
            int current = map.get(s.charAt(i));

            // if there is a next element
            if(i < s.length() - 1){
                // then you get the next element and compare it
                int next = map.get(s.charAt(i + 1));
                // if current is smaller that means subtraction
                if(current < next){
                    total -= current;
                } else{
                    total += current;
                } 
            } else{
                // the final element
                total += current;
            }
        }
        return total;
        
    }
}
