//package Week_3.Day_4;

import java.util.Stack;

public class Daily_temperature {
    public static void main(String[] args) {

    int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

    Solution s = new Solution();

    int[] ans = s.dailyTemperatures(temperatures);

    for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i] + " ");
    }
 }


    
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack  = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.empty() && temperatures[stack.peek()]<temperatures[i]){
                Integer pop = stack.pop();
                res[pop] = i - pop;
            }
            stack.push(i);
        }
        return res;
    }
}