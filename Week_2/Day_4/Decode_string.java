import java.util.Stack;

public class Decode_string {
    public static void main(String[] args) {
     String s = "3[a]2[bc]";
     Solution st = new Solution();
     System.out.println(st.decodeString(s));   
    }
    
}

class Solution {
    public String decodeString(String s) {

        Stack<String> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        String currentString = "";
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);

                k = 0;
                currentString = "";
            }
            else if (ch == ']') {

                int repeatCount = countStack.pop();
                String previousString = stringStack.pop();

                StringBuilder expandedString = new StringBuilder();

                for (int i = 0; i < repeatCount; i++) {
                    expandedString.append(currentString);
                }

                currentString = previousString + expandedString.toString();
            }
            else {
                currentString += ch;
            }
        }

        return currentString;
    }
}