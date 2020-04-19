public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String sortedStr = String.valueOf(word);

            if (!hashMap.containsKey(sortedStr))
                hashMap.put(sortedStr, new ArrayList<>());

            hashMap.get(sortedStr).add(strs[i]);
        }
        return new ArrayList<>(hashMap.values());
    }
}