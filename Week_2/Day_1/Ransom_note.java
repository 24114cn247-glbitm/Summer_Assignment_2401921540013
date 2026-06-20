public class Ransom_note {
    public static void main(String[] args) {
         String ransomNote = "aa";
         String magazine = "aab";
         Solution s = new Solution();
         System.out.println(s.canConstruct(ransomNote, magazine));
    }
    
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(char c : magazine.toCharArray()){
            count[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(count[c-'a']==0){
                return false;
            }
            count[c-'a']--;
        }
        return true;
    }
}