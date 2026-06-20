public class Two_sum {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = s.twoSum(nums, target);
        
        System.out.println(ans[0] + " " + ans[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}