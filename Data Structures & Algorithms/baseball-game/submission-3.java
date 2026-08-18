class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> deque = new ArrayDeque();
        int res = 0;
        for(String value : operations){
            switch(value){
               case "+"->{
                    int top = deque.pop();
                    int newTop = top + deque.peek();
                    deque.push(top);
                    deque.push(newTop);
                }
                case "D"->{
                    Integer last = deque.pop();
                                        deque.push(last);

                    deque.push(last * 2);
                }
                case "C" ->{
                    deque.pop();
                }
                default ->{
                    deque.push(Integer.valueOf(value));
                }
            }
        }
        while(!deque.isEmpty()){
            res += deque.pop();
        }
    return res;
    }
}