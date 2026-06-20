//package Week_2.Day_5;
import java.util.*;
public class Group_anagram {
    public static void main(String[] args){
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    Solution obj = new Solution();

    List<List<String>> ans = obj.groupAnagrams(strs);

    System.out.println(ans);
    }
    
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                key.append('#');
                key.append(freq[i]);
            }

            map.computeIfAbsent(key.toString(),
                    k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}