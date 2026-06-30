import java.util.Stack;

public class Valid_parentheses {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";

        System.out.println(obj.isValid(s1));
        System.out.println(obj.isValid(s2));
        System.out.println(obj.isValid(s3));
        System.out.println(obj.isValid(s4));
    }
}

class Solution {
    public char getVal(char ch){
        switch(ch){
            case ']' : return '[';
            case '}' : return '{';
            case ')' : return '(';
            default : return ' ';
        }
    }
    public boolean isValid(String s) {
        String opening = "({[";
        String closing = ")}]";
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(opening.indexOf(ch)!=-1)
               st.push(ch);
            else{
                if(st.size()==0) return false;
                char tmp = st.pop();
                if(getVal(ch)!=tmp) 
                return false;
            }
        }
        return st.size()==0;
    }
}