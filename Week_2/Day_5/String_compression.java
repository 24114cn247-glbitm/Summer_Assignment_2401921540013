public class String_compression {
    public static void main(String[] args) {
    char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

    Solution obj = new Solution();
    int len = obj.compress(chars);

    System.out.println("Length = " + len);

    for (int i = 0; i < len; i++) {
        System.out.print(chars[i] + " ");
    }

    }
    
}

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            chars[index++] = ch;

            if (count > 1) {
                String str = Integer.toString(count);

                for (char dig : str.toCharArray()) {
                    chars[index++] = dig;
                }
            }

            i--;
        }

        return index;
    }
}