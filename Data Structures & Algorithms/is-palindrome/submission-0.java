class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        String normal = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        return normal.equals(reversed);
    }
}
