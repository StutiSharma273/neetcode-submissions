class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String cur = String.valueOf(wordChar);
            map.computeIfAbsent(cur, k -> new ArrayList<>())
               .add(word);
        }

        return new ArrayList<>(map.values());
    }
}
