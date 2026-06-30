import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_greater_element {
    public static void main(String[] args) {
    Solution obj = new Solution();

    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};

    int[] ans = obj.nextGreaterElement(nums1, nums2);

    System.out.print("Output: ");
    for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i] + " ");
    }

    }
    
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<nums2.length;i=i+1){
            while(true){
               if(stack.isEmpty()){
                stack.push(i);
                break;
               }
               int idx = stack.peek();
               if(nums2[i]>nums2[idx]){
                map.put(nums2[idx],nums2[i]);
                stack.pop();
               }
               else{
                stack.push(i);
                break;
               }
            }
        }
        int[] res = new int [nums1.length];
        for(int i=0;i<res.length;i=i+1){
            if(map.containsKey(nums1[i])){
                res[i]=map.get(nums1[i]);
             }else{
                res[i] = -1;
             }
        }
        return res;
    }
}
