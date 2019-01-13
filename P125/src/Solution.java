public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < s.length() && !isAlphaNumeric(s.charAt(i))) ++i;
            while (j >= 0 && !isAlphaNumeric(s.charAt(j))) --j;
            if (i < j) {
//                System.out.println("Comparing [" + i + "] = " + s.charAt(i) +
//                        " and [" + j + "] = " + s.charAt(j));
                if (toLower(s.charAt(i)) != toLower(s.charAt(j))) return false;
                else {
                    ++i;
                    --j;
                }
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return isUpper(c) || isLower(c) || isNumeric(c);
    }

    public boolean isUpper(char c) {
        return 'A' <= c && c <= 'Z';
    }

    public boolean isLower(char c) {
        return 'a' <= c && c <= 'z';
    }

    public boolean isNumeric(char c) {
        return '0' <= c && c <= '9';
    }

    public char toLower(char c) {
        if (isUpper(c)) return (char)((int)c + ('a' - 'A'));
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(".,"));
    }
}
