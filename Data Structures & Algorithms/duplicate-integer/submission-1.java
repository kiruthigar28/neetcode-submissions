class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> inv = new HashSet<>();
        for(int i : nums) {
            if(inv.contains(i)) {
                return true;
            }
            inv.add(i);
        }
        return false;
    }
}