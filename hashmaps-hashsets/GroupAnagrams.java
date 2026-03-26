class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // We will use a hash map to store the sorted string as the key and array as value
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            // convert each string to character array to sort it.
            char[] chars = s.toCharArray();
            // sort it.
            Arrays.sort(chars);
            // put it back into a string.
            String key = new String(chars);
            //if map dosent have the key then add it as a key with an empty array list as value.
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            // otherwise get the key and add the s string value.
            map.get(key).add(s);
        }
        // return an array with all the map values.
        return new ArrayList<>(map.values());
    }
}
