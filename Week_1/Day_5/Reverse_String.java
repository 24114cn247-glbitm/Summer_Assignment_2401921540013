//package Week_1.Day_5;

public class Reverse_String {
    public static void main(String[] args) {
        char[] st = {'h','e','l','l','o'};
        Solution s = new Solution();
        s.reverseString(st);
        for(char x : st){
            System.out.print(x + " ");
        }
    }
    
}

class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}