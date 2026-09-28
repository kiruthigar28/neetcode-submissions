class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> check = new HashMap<>();
        int i=0;    
        while (i < nums.length) {
            if(check.containsKey(nums[i])) {
                return new int[]{check.get(nums[i]),i};
            }
            check.put(target - nums[i],i);
            i++;
        }
        return null;
    }
}
