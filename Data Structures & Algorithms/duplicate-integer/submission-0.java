class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> inv = new HashMap<>();
        for(int i : nums) {
            if(inv.containsKey(i)) {
                return true;
            }
            inv.put(i,0);
        }
        return false;
    }
}