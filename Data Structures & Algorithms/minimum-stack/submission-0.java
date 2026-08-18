class MinStack {
    private int min ;
    private Deque<Integer> deque;

    public MinStack() {
        min = Integer.MAX_VALUE;
        deque = new ArrayDeque();
    }
    
    public void push(int val) {
        min = Math.min(val,min);
        deque.push(val);
    }
    
    public void pop() {
        deque.pop();
    }
    
    public int top() {
        return deque.peek();
    }
    
    public int getMin() {
        Stack<Integer> tmp = new Stack<>();
        int mini = deque.peek();

        while (!deque.isEmpty()) {
            mini = Math.min(mini, deque.peek());
            tmp.push(deque.pop());
        }

        while (!tmp.isEmpty()) {
            deque.push(tmp.pop());
        }

        return mini;    }
}
