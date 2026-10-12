class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int i =0; i<s.length(); i++){
                   mapS.putIfAbsent(s.charAt(i), 1);
            mapS.computeIfPresent(s.charAt(i), (k, v) -> v + 1);

            mapT.putIfAbsent(t.charAt(i), 1);
            mapT.computeIfPresent(t.charAt(i), (k, v) -> v + 1);
        }
        return mapS.equals(mapT);

    }
}
