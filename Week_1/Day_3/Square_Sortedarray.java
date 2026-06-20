public class Square_Sortedarray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-4,-1,0,3,10};
        for(int m : nums){
            System.out.print(m + "  ");
        }
        System.out.println();
        System.out.println("square sorted array");
        for(int x : s.sortedSquares(nums)){
            System.out.print(x + "  ");
        }
    }   
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int str = 0;
        int end = n-1;
        int j = n-1;
        while(str<=end){
            int sqs = nums[str] * nums[str]; //s->str
            int sqe = nums[end] * nums[end];//e->end
            if(sqs>=sqe){
                res[j] = sqs;
                str++;
            }
            else{
                res[j] = sqe;
                end--;
            }
            j--;
        }
        return res;
    }
}