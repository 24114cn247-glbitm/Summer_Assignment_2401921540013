//package Week_1.Day_2;

public class Maximum_subarray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }
    
}

class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
