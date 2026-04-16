class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] ans = new int[26];
        Arrays.fill(ans,0);

        for(int i = 0; i< s.length(); i++){
            ans[s.charAt(i) - 'a'] += 1;
            ans[t.charAt(i) - 'a'] -= 1;
        }

        for(int i = 0; i < ans.length; i++){
            if(ans[i] != 0){
                return false;
            }
        }

        return true;

    }
}
