class RandomizedSet {
    HashSet<Integer,Integer> mp;
    ArrayList<Integer> list;
    public RandomizedSet() {
        mp= new HashSet<>();
        list= new ArrayList<>();
    }
    public boolean insert(int val) {
        if(search(val)){
            return false;
        }
        list.add(val);
        map.put(val, list.size()-1);
        return true;
        
    }
    public boolean search(int val){
        return mp.containsKey(val);
    }
    
    public boolean remove(int val) {
        if(!search(val)){
            return false;
        }
    }
    
    public int getRandom() {
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
