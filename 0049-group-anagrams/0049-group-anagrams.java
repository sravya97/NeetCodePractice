class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            List<String> words = new ArrayList<>();
            if(map.containsKey(sorted)){
                words = map.get(sorted);
            }
            words.add(strs[i]);
            map.put(sorted, words);
        }
        return new ArrayList<>(map.values());

    }
}