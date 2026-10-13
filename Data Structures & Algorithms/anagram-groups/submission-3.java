class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> h = new HashMap();
        for(String s : strs){
            int [] a = new int[26];
            for(char c : s.toCharArray()){
                a[c-'a']++;
            }
            String k = Arrays.toString(a);
            h.putIfAbsent(k, new ArrayList<>());
            h.get(k).add(s);
        }
        return new ArrayList<>(h.values());
    }
}
