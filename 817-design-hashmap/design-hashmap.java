class MyHashMap {
    private int[] h=new int[1000001];
    public MyHashMap() {
        Arrays.fill(h,-1);
    }
    
    public void put(int key, int value) {
        h[key]=value;
    }
    
    public int get(int key) {
        return h[key];
    }
    
    public void remove(int key) {
        h[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */