import java.util.ArrayList;
import java.util.List;
public class Find_all_anagram_string {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        Solution st = new Solution();
        System.out.println(st.findAnagrams(s,p));
    }
    
}

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        if(p.length() > s.length()) return list;
        int N = s.length();
        int M = p.length();
        int[] count = frequency(p);
        int[] currentcount = frequency(s.substring(0,M));
        if(aresame(count,currentcount))
        list.add(0);
        int i;
        for(i = M;i < N;i++){
            currentcount[s.charAt(i-M)-'a']--;
            currentcount[s.charAt(i)-'a']++;
            if(aresame(count,currentcount)){
                list.add(i-M+1);
            }
        }
        return list;    
    }
    private boolean aresame(int[] x,int[] y){
        for(int i = 0;i < 26;i++){
            if(x[i] != y[i])
            return false;
        }
        return true;
    }
    private int[] frequency(String s){
        int[] count = new int[26];
        for(int i = 0;i < s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        return count;
     }
}