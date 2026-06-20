public class Reverse_words_in_astring {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Solution st = new Solution();
        System.out.println(st.reverseWords(s));
    }
    
}

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] Words = s.split(" ");
        for(String word : Words){
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            sb.append(temp);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}