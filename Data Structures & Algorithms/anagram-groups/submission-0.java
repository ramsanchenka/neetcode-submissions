class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] keyArr = s.toCharArray();
            Arrays.sort(keyArr);
            String key = Arrays.toString(keyArr);
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
