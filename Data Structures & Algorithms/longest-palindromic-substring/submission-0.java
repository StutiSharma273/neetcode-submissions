class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        int resLen = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            // oddPalindrome
            left = i;
            right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > resLen) {
                    resLen = right - left + 1;
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            // evenPalindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > resLen) {
                    resLen = right - left + 1;
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return ans;
    }
}
