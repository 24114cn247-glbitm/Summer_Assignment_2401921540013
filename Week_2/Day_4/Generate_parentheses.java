import java.util.ArrayList;
import java.util.List;

class Generate_parentheses {
    public static void main(String[] args) {
        int n = 3;
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(n));
    }
}

class Solution {
    private List<String> answer;
    private int n;
    private char[] str;
    void generateString(int open,int close,int index){
        //recursion base case
        if(open == n && close == n){
            answer.add(new String(str));
            return;
        }
        //recursion recursive case
        if(open<n){
           str[index] = '(';
           generateString (open + 1,close,index + 1);  
        }
        if(close<open){
            str[index] = ')';
            generateString(open,close + 1,index + 1);
        }
    } 
    public List<String> generateParenthesis(int n) {
     this.n = n;
     this.answer = new ArrayList<>();
     this.str = new char[2 * n];
     generateString(0,0,0);
     return answer;   
    }
}