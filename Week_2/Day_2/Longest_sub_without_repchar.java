public class Longest_sub_without_repchar {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution st = new Solution();
        System.out.println(st.lengthOfLongestSubstring(s));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,right = 0;
        int[] arr = new int[256];
        int maxLength = 0;
        while(right<s.length()){
            char currentchar = s.charAt(right);
            int currentcharAscii = (int) currentchar;
            arr[currentcharAscii] = arr[currentcharAscii] + 1;
            while(arr[currentcharAscii] > 1){
                char leftchar = s.charAt(left);
                int leftcharAscii = (int) leftchar;
                arr[leftcharAscii]--;
                left++;
            }
            int currentwindowsize = right - left + 1;
            if(currentwindowsize > maxLength){
                maxLength = currentwindowsize;
            }
            right++;
        }
        return maxLength;
    }
}


