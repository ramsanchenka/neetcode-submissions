class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque();
        Map<Character,Character> map = new HashMap();
        map.put('}','{');
                map.put(')','(');
        map.put(']','[');
        for(char chr: s.toCharArray()){
            if(map.containsKey(chr)){
                if(!deque.isEmpty() && deque.peek() == map.get(chr)){
                    deque.pop();
                }else{
                    return false;
                }

            }else{
                deque.push(chr);
            }
        }
        return deque.isEmpty();
        
    }
}
