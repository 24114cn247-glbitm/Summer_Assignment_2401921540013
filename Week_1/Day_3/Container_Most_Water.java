public class Container_Most_Water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        for(int x : height){
            System.out.print(x + "  ");
        }
        System.out.println();
        Solution s = new Solution();
        System.out.println("Maximum water is : " + s.maxArea(height));
    }   
}

class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int maxwater = 0;
        while(lp < rp){
           int wd = rp - lp;
           int ht = Math.min(height[lp],height[rp]);
           int currwt = wd * ht;
           maxwater = Math.max(maxwater,currwt);
           int dum = height[lp] < height[rp] ? lp++ : rp--;
        }
        return maxwater;
    }
} 