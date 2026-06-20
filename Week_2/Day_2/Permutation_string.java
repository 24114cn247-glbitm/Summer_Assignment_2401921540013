public class Permutation_string {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        Solution s = new Solution();
        System.out.println(s.checkInclusion(s1, s2));
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length() > s2.length()){
        return false;
       } 
       int[] s1freq = new int[26];
       int[] windowfreq = new int[26];
       for(int i=0;i<s1.length();i++){
        s1freq[s1.charAt(i)-'a']++;
        windowfreq[s2.charAt(i)-'a']++;
       } 
       for(int i=s1.length();i<s2.length();i++){
        if(matches(s1freq,windowfreq)){
            return true;
        }
        windowfreq[s2.charAt(i)-'a']++;
        windowfreq[s2.charAt(i-s1.length())-'a']--;
       }
       return matches(s1freq,windowfreq);
    }
       private boolean matches(int[] s1freq, int[] windowfreq){
        for(int i=0;i<26;i++){
            if(s1freq[i]!=windowfreq[i]){
                return false;
            }
        }
        return true;
       }
}