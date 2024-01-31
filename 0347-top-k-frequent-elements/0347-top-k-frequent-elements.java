class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            
        }
        List<Integer> sortedlist = new ArrayList<>(map.keySet());
        sortedlist.sort((a,b) -> map.get(b) - map.get(a));
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = sortedlist.get(i);
            
        }
        return result;
    }
}