class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] frequency = new List[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for (int i=0 ; i<frequency.length ; i++) {
            frequency[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int ind = 0;

        for(int i=frequency.length-1 ; i > 0 ; i--) {
            for (int n : frequency[i]) {
                res[ind++] = n;
                if (ind == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
