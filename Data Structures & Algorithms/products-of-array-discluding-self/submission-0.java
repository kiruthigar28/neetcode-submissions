class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int lInd = 1, rInd = nums.length-2;
        pre[0] = 1;
        suf[nums.length-1] = 1;

        while(lInd < nums.length && rInd >= 0) {
            pre[lInd] = pre[lInd-1]*nums[lInd-1];
            suf[rInd] = suf[rInd+1] * nums[rInd+1];
            lInd++;
            rInd--;
        }

        for(int i=0 ; i<pre.length ; i++) {
            nums[i] = pre[i]*suf[i];
        }

        return nums;
    }
}  
