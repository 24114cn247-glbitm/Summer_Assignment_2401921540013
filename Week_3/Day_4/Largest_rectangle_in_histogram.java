//package Week_3.Day_4;

import java.util.Arrays;
import java.util.Stack;

public class Largest_rectangle_in_histogram {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] heights = {2, 1, 5, 6, 2, 3};

        int ans = obj.largestRectangleArea(heights);

        System.out.println("Largest Rectangle Area = " + ans);
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] leftspan = new int[len];
        Arrays.fill(leftspan,-1);
        int[] rightspan = new int[len];
        Arrays.fill(rightspan,len);
        //build rightspan
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<len;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                //System.out.println("Removing " + heights[st.peek()] + "due to" + );
                rightspan[st.pop()] = i;
            }
            st.push(i);
            }
            st.empty();
            for(int i=len-1;i>=0;i--){
                while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                    leftspan[st.pop()] = i;
                }
                st.push(i);
            }
            int maxres = 0;
            for(int i=0;i<len;i++){
                maxres = Math.max((rightspan[i]-leftspan[i]-1)*heights[i],maxres);
            }
            return maxres;
    }
}
