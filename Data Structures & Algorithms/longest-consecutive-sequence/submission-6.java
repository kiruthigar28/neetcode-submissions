class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 1;
        int length = 1;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                while (numSet.contains(num + 1)) {
                    num++;
                    length++;
                }
                longest = Math.max(longest, length);
                length = 1;
            }
        }
        return longest;
    }
}
