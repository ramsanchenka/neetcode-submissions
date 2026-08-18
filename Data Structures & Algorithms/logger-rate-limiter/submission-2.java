class Logger {

    Map<String,Integer> map = new HashMap<>();

    public Logger() {
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message)){
            Integer value = map.get(message);
            if(timestamp-value < 10)return false;
            map.put(message,timestamp);
            return true;
        }else{
            map.put(message, timestamp);
            return true;
        }
        
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
